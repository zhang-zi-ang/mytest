package Demo_05_Instanceof;

import Demo_04_Polymorphism.Animal;
import Demo_04_Polymorphism.Cat;
import Demo_04_Polymorphism.Dog;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-17 22:12
 * @description:
 * 如何才能知道一个父类引用的对象，本来是什么子类？
 * 格式：
 * 对象 instanceof 类型
 * 这将得到一个布尔值结果，也就是判断前面的对象能不能当做后面类型的实例。
 */
public class Demo_05_Instanceof {
	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.eat();//猫吃鱼

		//如果调用特有方法，需要乡下转型。
		//判断是不是dog
		if (animal instanceof Dog){
			Dog dog = (Dog)animal;
			dog.watchhouse();
		}
		//判断一下是不是cat
		if (animal instanceof Cat){
			Cat cat = (Cat)animal;
			cat.catchMouse();
		}

		giveMeAPet(new Dog());
	}

	public static void giveMeAPet(Animal animal) {
		//判断是不是dog
		if (animal instanceof Dog){
			Dog dog = (Dog)animal;
			dog.watchhouse();
		}
		//判断一下是不是cat
		if (animal instanceof Cat){
			Cat cat = (Cat)animal;
			cat.catchMouse();
		}
	}
}
