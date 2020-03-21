package Demo_12_Hero;

/**
 * @program: mygit
 * @author: zhang-zi-ang
 * @create: 2020-03-21 22:29
 * @description: ${description}
 */
public class Hero {
	private String name;//英雄名字

	private int age;//年龄

	private Weapon weapon;//武器

	public void attack(){
		System.out.println("年龄为" + age + "的" + name + "正在用" +weapon.getCode() + "攻击敌方" );
	}

	public Hero() {
	}

	public Hero(String name, int age, Weapon weapon) {
		this.name = name;
		this.age = age;
		this.weapon = weapon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
}
