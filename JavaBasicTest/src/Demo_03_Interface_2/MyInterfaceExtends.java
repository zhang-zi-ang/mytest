package Demo_03_Interface_2;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-15 21:59
 * @description:
 * 这个子接口中有几个方法？
 * 答：4个
 * methodA来源于接口A
 * methodB来源于接口B
 * methodC来源于接口A和B
 * method来源于自己
 *
 */
public interface MyInterfaceExtends extends MyInterfaceA,MyInterfaceB {
	void method();

	@Override
	public default void methodDefault(){
		System.out.println("mymymy");
	}

}
