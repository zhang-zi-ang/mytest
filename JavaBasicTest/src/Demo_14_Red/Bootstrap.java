package Demo_14_Red;

import Red.OpenMode;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-24 22:44
 * @description:
 * 场景说明：
 * 红包发出去之后，所有人都有红包，大家抢完了以后，最后一个红包给群主自己
 * 大多数代码都是现成的，我们需要做的就是填空题。
 *
 * 我们自己要做的事情有：
 * 1.设置一下程序的标题，通过构造方法的字符串参数
 * 2.设置群主名称
 * 3.设置分发策略：平均/随机
 * 红包分发的策略：
 * 1.普通红包（平均）：totalMoney / totalCount，余数放在最后一个红包当中。
 * 2.手气红包（随机）：最少1分钱，最多不超过平均数的2倍。应该越发越少。
 */
public class Bootstrap {
	public static void main(String[] args) {
		MyRed red  = new MyRed("zhang-zi-ang");

		//群主名称
		red.setOwnerName("渣渣昂");

		//普通红包
//		OpenMode normal = new NormalMode();
//		red.setOpenWay(normal);

		OpenMode random = new RandomMode();
		red.setOpenWay(random);
	}
}
