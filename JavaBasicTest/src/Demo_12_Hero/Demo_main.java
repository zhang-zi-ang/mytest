package Demo_12_Hero;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-21 22:40
 * @description: ${description}
 */
public class Demo_main {
	public static void main(String[] args) {
		//创建一个游戏角色
		Hero hero = new Hero();
		//起名字
		hero.setName("盖伦");
		hero.setAge(20);

		//创建一个武器对象
		Weapon weapon = new Weapon("多兰剑");

		//为英雄配备武器
		hero.setWeapon(weapon);

		//年龄为20的盖伦正在用多兰剑攻击敌方
		hero.attack();
	}
}
