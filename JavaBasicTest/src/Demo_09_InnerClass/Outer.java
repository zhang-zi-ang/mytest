package Demo_09_InnerClass;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-19 22:12
 * @description:
 * 如果出现了重名现象，那么格式是：外部类名称.this.外部类成员变量
 */
public class Outer {

	int num = 10;//外部类的成员变量
	public class Inner {

		int num = 20;//内部类的成员变量

		public void methodInner() {
			int num = 30;//内部类方法的局部变量
			System.out.println(num);//局部变量，就近原则
			System.out.println(this.num);//20，内部类的成员变量
			System.out.println(Outer.this.num);//30，外部类的成员变量
		}
	}
}
