package Demo_04_Polymorphism;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-15 22:24
 * @description:
 * 1.直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找。
 * 成员变量是不能覆盖重写的！！！
 * 2.间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找
 */
public class Demo_04MultiField {
	public static void main(String[] args) {
		//使用多态的写法，父类引用指向子类对象。
		Fu obj = new Zi();
		System.out.println(obj.num);
//		System.out.println(obj.age); 不可能向下找。
		System.out.println("===========");

		//子类没有覆盖重写，就是父：10
		//子类如果覆盖重写，就是子：20
		obj.shownum();

	}
}
