package Demo_02_Interface;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-11 22:08
 * @description:
 * 在任何版本的JAVA中，接口都能定义抽象方法：
 * public abstract 返回值类型 方法名称（参数列表）;
 * 方法三要素可以随意定义。
 *
 */
public interface MyInterfaceAbstract {

	//这是一个抽象方法，接口中的抽象方法必须是固定关键字：public abstract
	//后面可以省略性的省略前两个关键字
	public abstract void methodAbs1();

	public void methodAbs2();

	abstract void methodAbs3();

	void methodAbs4();

}
