package Demo_06_USB;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-17 22:40
 * @description: ${description}
 */
public class Keyboard implements USB {
	@Override
	public void open() {
		System.out.println("打开键盘");
	}

	@Override
	public void close() {
		System.out.println("关闭键盘");
	}

	public void type(){
		System.out.println("键盘输入");
	}
}
