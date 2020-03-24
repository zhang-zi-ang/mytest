package Demo_14_Red;

import java.util.ArrayList;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-24 22:46
 * @description:
 * totalMoney:总金额，1元换算成100分
 * totalCount:红包个数
 * ArrayList<Integer>:内部元素为红包的金额值，所有元素累加一起为总金额
 */
public interface OpenMode {
	ArrayList<Integer> divide(int totalMoney,int totalCount);
}
