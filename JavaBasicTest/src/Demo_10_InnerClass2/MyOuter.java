package Demo_10_InnerClass2;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-20 22:58
 * @description:
 * 局部内部类，如果希望访问所在方法的局部变量，那么这个局部变量必须是【有效final的】。
 *
 * 备注：从Java8+开始，只要局部变量事实不变，那么final关键字可以省略。
 *
 * 原因：
 * 1.new出来的对象在堆内存中
 * 2.局部变量是跟着方法走的，在栈内存中。
 * 3.方法运行结束只会，立刻出栈，局部变量就会立刻消失。
 * 4.new出来的对象堆当中持续存在，直到垃圾回收消失。
 *
 * 内部类要保证生命周期和局部变量同步，所以只能使用final关键字修饰的局部变量。
 *
 */
public class MyOuter {

	public void methodOuter(){
		int num = 10;

//		num = 20; 报错了，num此时就不算final变量了

		class MyInner{
			public void methodInner(){
				System.out.println(num);
			}
		}
	}
}
