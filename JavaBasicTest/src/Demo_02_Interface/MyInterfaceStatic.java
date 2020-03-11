package Demo_02_Interface;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-11 22:39
 * @description:
 * Java8开始，接口当中允许定义静态方法。
 * 格式：
 * public static 返回值类型 方法名称（参数列表）{
 *     //方法体
 * }
 *
 * 提示：一定要有方法体
 */
public interface MyInterfaceStatic {
	public static void methodStatic() {
		System.out.println("这是接口的静态方法");
	}
}
