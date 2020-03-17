package Demo_06_USB;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-17 22:44
 * @description: ${description}
 */
public class Demo_06Main {
	public static void main(String[] args) {
		//创建笔记本
		Computer computer = new Computer();
		computer.powerOn();

		//准备一个鼠标
//		Mouse mouse = new Mouse();
		//首先进行向上转型
		USB usbMouse = new Mouse();
		//参数是USB类，传入USB鼠标
		computer.useDevice(usbMouse);

		//创建一个键盘
		Keyboard keyboard = new Keyboard();//不是多态写法
		//方法参数是USB，传进去是实现类
		computer.useDevice(keyboard);//正确!也发生了向上转型。
		//事实上实现类也可以向上转型成接口类。
//		computer.useDevice(new Keyboard());


		computer.powerOff();

		method(10.0);//正确写法，double-->double
		method(20);//正确写法，int-->double
	}

	public static void method(double num) {
		System.out.println(num);
	}
}
