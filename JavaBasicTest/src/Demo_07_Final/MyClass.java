package Demo_07_Final;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-19 20:47
 * @description: 当final关键字用来修饰一个类的时候，格式：
 * public final class 类名称{
 *     //...
 * }
 *
 * 含义：当前这个类不能有任何的子类（太监类，没有儿子）
 * 注意：一个类如果是final的，因为没有子类，所以也没有方法进行覆盖重写。
 */
public final class MyClass {
	public void method(){
		System.out.println("方法执行");
	}
}
