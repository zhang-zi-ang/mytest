package Demo_04_Polymorphism;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-16 22:32
 * @description:
 * 向上转型一定是安全的，但也有个弊端：
 * 一旦向上转型为父类，那么就无法调用子类原本特有的方法。
 *
 * 解决方法：使用向下转型进行还原。
 */
public class Demo_04Main {
	public static void main(String[] args) {
		//对象的向上转型，就是：父类引用指向之类的对象
		Animal animal = new Cat();
		animal.eat();

		Cat cat=(Cat)animal;//本来是猫，已经被当做动物了，还原回来本来的猫。
		cat.catchMouse();;

//		Dog dog=(Dog)animal;
//		dog.watchhouse(); 错误写法，编译不报错，但是运行出现类转换异常。

		//animal.catchMouse();错误写法
	}
}
