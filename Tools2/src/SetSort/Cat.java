package SetSort;

public class Cat {
	private String name; //名字
	private int month; //年龄
	private String species;//品种
	
	//构造方法
	public Cat(String name, int month, String species) {
		super();
		this.name = name;
		this.month = month;
		this.species = species;
	}
    //getter与setter方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	@Override
	public String toString() {
		return "[名字：" + name + ", 年龄：" + month + ", 品种：" + species + "]";
	}
}
