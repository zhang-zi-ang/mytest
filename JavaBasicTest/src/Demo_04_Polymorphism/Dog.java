package Demo_04_Polymorphism;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-16 22:55
 * @description: ${description}
 */
public class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println("狗吃骨头");
	}

	public void watchhouse(){
		System.out.println("狗看家");
	}


}
