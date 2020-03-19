package Demo_08_Authority.sub;

import Demo_08_Authority.MyClass;//需要导包，不是同一个包

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-19 21:36
 * @description: ${description}
 */
public class MySon extends MyClass {
	public void method(){
		System.out.println(super.num);
	}
}
