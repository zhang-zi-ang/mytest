package Demo_07_Final;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-19 20:55
 * @description:
 *
 * 当final关键字用来修饰一个方法的时候，这个方法就是最终方法，也就是不能被覆盖重写。
 * 格式：
 * 修饰符 final 返回值类型 方法名称（参数列表）{
 *   //方法体
 * }
 *
 * 注意事项：
 * 对于类和方法来说，abstract关键字和final不能同时使用，因为矛盾。
 */
public class Zi extends Fu {
	@Override
	public void methodAbs() {

	}

//	错误写法，不能覆盖重写父类当中final方法
//	@Override
//	public void method() {
//		System.out.println("子类覆盖重写父类的方法！");
//
//	}
}
