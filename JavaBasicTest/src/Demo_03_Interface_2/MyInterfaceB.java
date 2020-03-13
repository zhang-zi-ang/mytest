package Demo_03_Interface_2;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-13 21:20
 * @description: ${description}
 */
public interface MyInterfaceB {
	public abstract void methodB();
	public abstract void methodC();

	public default void methodDefault(){
		System.out.println("BBB");
	}
}
