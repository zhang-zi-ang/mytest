package Demo_13_Hero2;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-21 22:54
 * @description: ${description}
 */
public class DemoGame {
	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.setName("艾希");//设置英雄名称
//		hero.setkill(new SkillImpl());//使用单独定义的实现类

		//还可以使用匿名内部类

//		Skill skill = new Skill() {
//			@Override
//			public void use() {
//				System.out.println("pia pia pia");
//			}
//		};
//
//		hero.setSkill(skill);

		//同时使用匿名内部类和匿名对象

		hero.setSkill(new Skill() {
			@Override
			public void use() {
				System.out.println("chua chua chua");
			}
		});
		hero.attack();
	}
}
