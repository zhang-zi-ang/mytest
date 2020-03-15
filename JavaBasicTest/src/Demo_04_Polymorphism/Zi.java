package Demo_04_Polymorphism;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-15 22:19
 * @description: ${description}
 */
public class Zi extends Fu {
	@Override
	public void method() {
		System.out.println("子类方法");
	}

	public void methodZi(){
		System.out.println("子类独有");
	}



	int num = 20;

	int age = 16;


	@Override
	public void shownum() {
		System.out.println(num);
	}
}
