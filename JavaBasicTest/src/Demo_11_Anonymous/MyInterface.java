package Demo_11_Anonymous;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-21 21:52
 * @description: ${description}
 */
public interface MyInterface {

	void method1();// 抽象方法
	void method2();// 抽象方法

	default void methoddf(){
		System.out.println("默认");
	}
}
