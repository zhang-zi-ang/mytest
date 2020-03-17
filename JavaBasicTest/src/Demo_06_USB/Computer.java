package Demo_06_USB;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-17 22:36
 * @description: ${description}
 */
public class Computer {
	public void powerOn(){
		System.out.println("笔记本电脑开机");
	}

	public void powerOff(){
		System.out.println("笔记本电脑关机");
	}

	//使用USB设备的方法，使用接口做方法的参数
	public void useDevice(USB usb ){
		usb.open();//打开设备

		if(usb instanceof Mouse){
			((Mouse) usb).click();
		}else if (usb instanceof Keyboard){
			((Keyboard) usb).type();
		}

		usb.close();//关闭设备
	}
}
