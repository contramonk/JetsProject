package week2;

public class Pilot {
	private String name;
	private int age;
	private String xp;
	
	public Pilot(String name, int age, String xp) {
		setName(name);
		setAge(age);
		setXp(xp);
	}
	public String getName() {
		return name;
	}
	public void setName(String nm) {
		this.name = nm;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		this.age = a;
	}
	public String getXp() {
		return xp;
	}
	public void setXp(String x) {
		this.xp = x;
	}
}
