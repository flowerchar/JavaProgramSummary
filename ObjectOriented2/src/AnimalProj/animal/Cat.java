package AnimalProj.animal;



public class Cat extends Animal {
	private double weight;//体重
	//public int temp=300;
	public static int st3=44;
	
	static{
		System.out.println("我是子类的静态代码块");
	}
	
	{
		System.out.println("我是子类的构造代码块");
	}
	
	public Cat(){
//		Animal temp=new Animal();
//		temp.name;
//		this.temp=12;
//		this.month=23;
//		this.species="";
		System.out.println("我是子类的无参构造方法");
	}
	
	public Cat(String name,int month){
		/* 子类构造默认调用父类无参构造方法
		 * 可以通过super()调用父类允许被访问的其他构造方法
		 * super()必须放在子类构造方法有效代码第一行
		 */
		super(name,month); //this
		System.out.println("我是子类的带参构造方法");
	}
	
	public static void say(){
//		this.weight=20;
//		super.name="aa";
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//跑动的方法
	public void run(){
//		super();
//		eat();
//		Animal();
		System.out.println(this.getName()+"是一只"+this.getSpecies()+",它在快乐的奔跑");
	}
}
