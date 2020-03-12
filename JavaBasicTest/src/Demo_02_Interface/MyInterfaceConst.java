package Demo_02_Interface;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-12 21:14
 * @description:
 * 接口当中也可以定义"成员变量"，但是必须使用public static final三个关键词
 * 从效果上看，这其实就是接口的【常量】
 * 格式：
 * public static final 数据类型 常量名称 = 数据;
 * 注意：
 * 一旦使用final关键词进行修饰，说明不可改变。
 *
 * 1.接口当中的常量，可以省略public static final
 * 2.接口当中的常量，必须赋值。
 */
public interface MyInterfaceConst {
	//这其实就是一个常量，一旦赋值，不可修改
	public static final int NUM_OF_MY = 12;
}
