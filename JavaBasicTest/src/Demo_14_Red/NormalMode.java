package Demo_14_Red;

import Red.OpenMode;

import java.util.ArrayList;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-28 14:59
 * @description: ${description}
 */
public class NormalMode implements OpenMode {

	@Override
	public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {

		ArrayList<Integer> list = new ArrayList<>();

		int avg = totalMoney / totalCount; //平均数
		int mod = totalMoney % totalCount; //余数，模除，零头

		//注意，最后一个先留着
		for (int i = 0; i < totalCount - 1; i++) {
			list.add(avg);
		}

		//最后一个红包放零头

		list.add(avg + mod);

		return list;
	}
}
