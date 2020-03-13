package Demo_03_Interface_2;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-13 22:05
 * @description: ${description}
 */
public interface MyInterface {
	public default void method(){
		System.out.println("接口中的默认方法");
	}
}
