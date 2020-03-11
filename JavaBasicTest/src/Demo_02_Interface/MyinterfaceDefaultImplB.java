package Demo_02_Interface;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-11 22:28
 * @description: ${description}
 */
public class MyinterfaceDefaultImplB implements MyInterfaceDefault {
	@Override
	public void methodAbs() {
		System.out.println("实现了抽象方法，AAA");
	}

	@Override
	public void methodDefault() {
		System.out.println("修改后的默认方法");
	}
}
