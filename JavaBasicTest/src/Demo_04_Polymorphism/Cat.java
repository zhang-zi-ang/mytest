package Demo_04_Polymorphism;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-16 22:29
 * @description: ${description}
 */
public class Cat extends Animal{
	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}

	//cat独有方法
	public void catchMouse(){
		System.out.println("猫抓老鼠");
	}
}
