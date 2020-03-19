package Demo_07_Final;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-19 21:19
 * @description:
 * 对于成员变量来说，如果使用final关键字修饰，那么这个变量也照样不可变
 *
 * 1.由于成员变量有默认值，所以用了final之后必须手动赋值，不会再给默认值的
 * 2.对于final的成员变量，要不使用直接赋值，要不通过构造方法赋值。
 * 3.必须保证类当中所有重载的构造方法，都最终会对final的成员变量进行赋值。
 */
public class Person {

	private final String name /*= "鹿晗"*/;

	public Person() {
		name = "关晓彤";
	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
}
