package Demo_02_Interface;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-11 22:23
 * @description:
 *
 * 从JAVA8开始，接口里允许定义默认方法。
 * 格式：
 * public default 返回值类型 方法名称（参数列表）{
 *     //方法体
 * }
 *
 * 备注：接口当中的默认方法，可以解决接口升级的问题。
 */
public interface MyInterfaceDefault {

	//抽象方法
	public abstract void methodAbs();

	//又来一个抽象方法，当接口升级时会出问题
	//public abstract void methodDefault();

	//使用默认方法可以解决问题，所有实现都会拥有此方法
	//public可以省略不写
	public default void methodDefault(){
		System.out.println("这是默认方法");
	}

}
