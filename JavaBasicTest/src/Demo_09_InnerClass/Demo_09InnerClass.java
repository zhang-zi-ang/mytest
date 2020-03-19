package Demo_09_InnerClass;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-19 21:46
 * @description:
 * 如果一个事物的内部包含另一个事物，那就是一个类内部包含另一个类。也就是内部类
 * 例如：身体和心脏的关系。又如：汽车和发动机的关系。
 *
 * 分类：
 * 1.成员内部类
 * 2.局部内部类（包含匿名内部类）
 *
 * 成员内部类的定义格式：
 * 修饰符 class 外部类名称{
 *     修饰符 class 内部类名称{
 *         //...
 *     }
 *     //..
 * }
 *
 * 注意：内用外，随意访问；外用内，需要内部类对象。
 *
 * =================
 * 如何使用成员内部类？有两种方式：
 * 1.在外部类的方法中，使用内部类。
 * 2.直接方式：公式：
 * 类名称 对象名 = new 类名称（）；
 * 外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
 */
public class Demo_09InnerClass {
	public static void main(String[] args) {
		Body body = new Body();//外部类对象
		//通过外部类的对象，调用外部类的方法，里面间接找到heart
		body.methodBody();
		System.out.println("++++++");

		//按照公式写：
		Body.Heart heart = new Body().new Heart();
		heart.beat();

		//匿名访问也可以
		System.out.println("++++++");
		new Body().new Heart().beat();
	}
}
