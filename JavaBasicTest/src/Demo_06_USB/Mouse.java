package Demo_06_USB;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-17 22:39
 * @description:
 * //鼠标本身是一个USB设备
 */
public class Mouse implements USB {
	@Override
	public void open() {
		System.out.println("打开鼠标");
	}

	@Override
	public void close() {
		System.out.println("关闭鼠标");
	}

	public void click(){
		System.out.println("鼠标点");
	}
}
