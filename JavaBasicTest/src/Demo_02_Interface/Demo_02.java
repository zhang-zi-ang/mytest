package Demo_02_Interface;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-11 21:49
 * @description:
 * 接口的学习:
 *
 * 接口是什么？
 * 接口是多个类的公共规范。
 * 接口是一种引用数据类型，最重要的内容就是其中的抽象方法。
 *
 * 如何定义一个接口？
 * public interface 接口名称{
 *     //接口内容
 * }
 *
 * 接口中有什么内容？
 * 如果是JAVA7，有常量和抽象方法。
 * 如果是JAVA8以上，还能有默认方法和静态方法。
 * 如果是JAVA9以上，还能有私有方法。
 *
 * 接口使用步骤？
 * 1.接口不能直接使用，必须有一个"实现类"来实现该接口。
 * 格式：
 * public class 实现类名称 implements 接口名称{
 *     // ...
 * }
 * 2.接口的实现类必须覆盖重写（实现）接口中所有的抽象方法。
 * 实现：去掉abstract关键字，加上方法体大括号。
 * 3.创建实现类的对象，进行使用。
 *
 * 注意事项：
 * 1.如果实现类并没有覆盖重写接口中所有抽象方法，那么这个实现类自己就必须是抽象类。
 * 2.默认方法也可以被覆盖重写
 *
 * 总结：
 * 1.成员变量其实是常量，格式：
 * public static final 数据类型 名称= 数据;
 *
 * 2.接口中最重要的就是抽象方法，格式：
 * public abstract 返回值类型 方法名称（参数列表）;
 * 注意：实现类必须覆盖重写接口所有的抽象方法，出发是抽象类。
 *
 * 3.从JAVA8+，接口里允许定义默认方法：
 * public default 返回值类型 方法名称（参数）{方法体}
 * 注意：默认方法可以被覆盖重写
 *
 * 4.从JAVA8+，接口里允许定义静态方法：
 * public static 返回值类型 方法名称（参数）{方法体}
 * 注意：必须使用接口名称调用，不能实现类调用
 *
 * 5.从JAVA9+，接口里允许定义私有方法
 * private方法智能自己调用，不能给别人调用或使用
 */
public class Demo_02{
	public static void main(String[] args) {
		MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
		impl.methodAbs1();
		impl.methodAbs2();
		impl.methodAbs3();
		impl.methodAbs4();

		MyinterfaceDefaultImplA implA = new MyinterfaceDefaultImplA();
		//抽象方法实现
		implA.methodAbs();
		//默认方法
		implA.methodDefault();

		MyinterfaceDefaultImplB implB = new MyinterfaceDefaultImplB();
		//抽象方法实现
		implB.methodAbs();
		//重写后的默认方法
		implB.methodDefault();

	}


}
