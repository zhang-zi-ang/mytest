package Demo_04_Polymorphism;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-15 22:17
 * @description:
 * 代码当中提现多态性，其实就是：父类引用指向子类对象。
 * 父类名称 对象名 = new 子类名称（）；
 * 或者
 * 接口名称 对象名 = new 实现类名称（）;
 */
public class Demo_04Multi {
	public static void main(String[] args) {
		//多态的写法
		Fu obj = new Zi();

		obj.method();
		obj.methodFu();
	}
}
