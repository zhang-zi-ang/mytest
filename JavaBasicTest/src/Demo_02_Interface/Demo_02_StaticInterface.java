package Demo_02_Interface;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-11 22:43
 * @description: 接口里静态方法的用法
 *
 * 1.不能通过接口实现类的对象来调用接口中的静态方法。
 * 2.正确用法：通过接口名称直接调用其中的静态方法。
 * 3.实际上静态方法是专属于接口类的方法
 *
 * 格式：
 * 接口名称.静态方法名（参数）；
 */
public class Demo_02_StaticInterface {
	public static void main(String[] args) {
		MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

		//错误写法！静态方法不能这样被调用
		//impl.methodStatic();
		MyInterfaceStatic.methodStatic();
	}
}
