package Demo_03_Interface_2;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-13 21:25
 * @description: ${description}
 */
public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB {
	@Override
	public void methodA() {
		System.out.println("覆盖重写了A");
	}

	@Override
	public void methodC() {
		System.out.println("覆盖重写了AB接口都有的抽象方法");
	}

	@Override
	public void methodB() {
		System.out.println("覆盖重写了B");
	}

	@Override
	public void methodDefault() {
		System.out.println("对冲突的默认方法一定要覆盖重写");
	}
}
