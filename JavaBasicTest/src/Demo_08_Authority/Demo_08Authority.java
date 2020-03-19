package Demo_08_Authority;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-19 21:28
 * @description:
 *
 * java中有四种权限修饰符：
 * 			           public > protected > (default) >private
 * 同一个类(我自己)		 yes	   yes		   yes		  yes
 * 同一个包(我邻居)	     yes       yes         yes        no
 * 不同包子类	（我儿子）    yes       yes         no         no
 * 不同包非子类（陌生人）	 yes       no          no         no
 *
 * 注意事项：Default不是关键字，而是指不加修饰符
 */
public class Demo_08Authority {
}
