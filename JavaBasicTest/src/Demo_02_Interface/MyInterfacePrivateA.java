package Demo_02_Interface;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-11 22:51
 * @description:
 * 问题描述：
 * 我们需要抽取一个共有方法，用来解决两个默认方法重复代码的问题。
 * 但是这个共有方法不应该让实现类使用，应该是私有化的。
 *
 * 解决方案:从JAVA9开始，接口当中允许定义私有方法
 * 1.普通私有方法，解决多个默认方法之间重复代码问题
 * 2.静态私有方法，解决多个静态方法之间重复代码问题
 */
public interface MyInterfacePrivateA {
	default void methodDefaultA(){
		System.out.println("默认方法1");
		methodCommon();
	}

	default void methodDefaultB(){
		System.out.println("默认方法1");
		methodCommon();
	}

	default void methodCommon(){
		System.out.println("AAA");
		System.out.println("BBB");
		System.out.println("CCC");
	}

// 		java9才支持
//	private default void methodCommon(){
//		System.out.println("AAA");
//		System.out.println("BBB");
//		System.out.println("CCC");
//	}
}
