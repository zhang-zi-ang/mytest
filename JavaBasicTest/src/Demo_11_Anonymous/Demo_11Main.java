package Demo_11_Anonymous;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-21 21:54
 * @description:
 * 如果接口是实现类，或者父类的子类，只需要使用唯一的一次。
 * 那么这种情况下就可以省略掉该类的定义，而改用使用【匿名内部类】
 *
 * 匿名内部类的定义格式：
 * 接口名称 对象名 = new 接口名称(){
 *     //覆盖重写所有抽象方法
 * };
 *
 * 对格式进行解析"new 接口名称(){...}"进行解析：
 * 1. new代表创建对象的动作
 * 2. 接口名称就是匿名内部类需要实现哪个接口
 * 3. {...}这才是匿名内部类的内容
 *
 * 另外还要注意几点问题：
 * 1.匿名内部类，在创建对象的时候只能使用唯一一次。
 * 如果希望多次创建，最好使用implement实现类。
 *
 * 2.匿名对象，在【调用方法】的时候只能调用一次。
 * 如果希望同一个对象，调用多次方法，那么必须给对象取个名字。
 *
 * 3.匿名内部类是省略了【实现类/子类】，但是匿名对象是省略了【对象名称】
 * 强调：匿名内部类和匿名对象不是一回事！！！
 */
public class Demo_11Main {
	public static void main(String[] args) {
//		MyInterface obj = new MyInterfaceImpl();
//		obj.method();

		MyInterface objA = new MyInterface() {
			@Override
			public void method1() {
				System.out.println("111-a");

			}

			@Override
			public void method2() {
				System.out.println("222-a");

			}
		};

		objA.method1();
		objA.methoddf();

		//使用了匿名内部类，而且省略了对象名称，也是匿名对象
		new MyInterface() {
			@Override
			public void method1() {
				System.out.println("111-b");

			}

			@Override
			public void method2() {
				System.out.println("222-b");

			}
		}.method1();//只能来一次
		//因为匿名对象无法调用第二次方法，所以需要在创建一个匿名内部类的匿名对象。

		new MyInterface() {
			@Override
			public void method1() {
				System.out.println("111-b");

			}

			@Override
			public void method2() {
				System.out.println("222-b");

			}
		}.method2();//只能来一次
	}
}
