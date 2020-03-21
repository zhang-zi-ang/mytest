package Demo_13_Hero2;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-21 23:08
 * @description:
 * java.util.list 正是 ArrayList所实现的接口。
 */
public class DemoInterface {
	public static void main(String[] args) {
		//左边是接口，右边是实现类，这就是多态写法
		List<String> list = new ArrayList<>();

		List<String> result = addNames(list);

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));

		}
	}

	public static List<String> addNames(List<String> list){
		list.add("迪丽热巴");
		list.add("古力娜扎");
		list.add("马尔扎哈");
		list.add("沙扬娜拉");

		return list;

	}
}
