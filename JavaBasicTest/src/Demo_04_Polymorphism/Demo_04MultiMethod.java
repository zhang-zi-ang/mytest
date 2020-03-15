package Demo_04_Polymorphism;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-15 22:35
 * @description:
 * 在多态的代码当中，成员方法的访问规则是：
 * 1.看new的是谁就用谁，没有则向上找
 *
 * 口诀：编译看左边，运行看右边。
 *
 * 对比一下：
 * 成员变量：编译看左边，运行还是看左边。
 * 成员方法：编译看左边，运行看右边
 */
public class Demo_04MultiMethod {
	public static void main(String[] args) {
		Fu obj = new Zi();
		obj.method();//父子都有，用子
		obj.methodFu();//子类没有，父类用，向上找到父类

		//编译看左，左边是Fu，Fu没有methodZi，所以编译报错。
//		obj.methodZi();//错误写法
		((Zi) obj).methodZi();
	}
}
