package Demo_09_InnerClass;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-19 21:53
 * @description: ${description}
 */
public class Body {//外部类

	public class Heart{//成员内部类
		//内部类的方法
		public void beat(){
			System.out.println("心脏挑动");
			System.out.println("我叫"+name);
		}

	}

	//外部类的成员变量
	private String name;


	//外部类的方法
	public void methodBody(){
		System.out.println("外部类的方法");
//		Heart heart = new Heart();
//		heart.beat();
		new Heart().beat();
	}
}
