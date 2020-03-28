package Demo_14_Red;

import Red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-28 23:15
 * @description: ${description}
 */
public class RandomMode implements OpenMode {
	@Override
	public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
		ArrayList<Integer> list = new ArrayList<>();

		//随机分配，有可能多，有可能少
		//最少一分钱，最多不超过"剩下金额平均数的二倍"。
		//第一次发红包，范围为：0.01~6.66元
		//第一次发完以后，剩下最少是3.34元。
		//此时还需要再发2个红包
		//此时的再发范围应该是0.01~3.34元（左闭右开，取不到右边）。

		//总结一下，范围的公式是：1 + random.nextInt(leftMoney/leftCount * 2);
		Random r = new Random();//创建一个随机数生成器
		//totalMoney是总金额，totalCount是总分数不变
		//额外定义两个变量，分别代表剩下多少钱，剩下多少份。
		int leftMoney = totalMoney;
		int leftCount = totalCount;

		//随机发前n-1个，最后一个不需要随机
		for (int i = 0; i < totalCount; i++) {
			int money = r.nextInt(leftMoney/leftCount * 2)+1;
			list.add(money);
			leftMoney -= money;//总金额越发越少
			leftCount--;//剩下应该再发的应该也递减
		}

		//最后一个不需要随机，直接放进去就得了
		list.add(leftMoney);
		return list;
	}
}
