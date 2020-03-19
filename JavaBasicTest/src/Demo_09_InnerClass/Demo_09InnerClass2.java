package Demo_09_InnerClass;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-19 22:18
 * @description: ${description}
 */
public class Demo_09InnerClass2 {
	public static void main(String[] args) {
		Outer.Inner obj = new Outer().new Inner();
		obj.methodInner();
	}
}
