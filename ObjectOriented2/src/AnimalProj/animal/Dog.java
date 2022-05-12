package AnimalProj.animal;

public class Dog extends Animal {
	private String sex;//性别
	
	public Dog(){
		
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}


	//睡觉的方法
	 public void sleep(){
		 super.eat();//调用的哪个eat();
		 this.species="犬科";
		 System.out.println("他的种类是" + getSpecies());
		 System.out.println(this.getName()+"现在"+this.getMonth()+"个月大，它在睡觉~~");
	 }
	 
	 /*
	  * 方法重载：
	  * 1、同一个类中
	  * 2、方法名相同，参数列表不同（参数顺序、个数、类型）
	  * 3、方法返回值、访问修饰符任意
	  * 4、与方法的参数名无关
	  * 
	  * 方法重写
	  * 1、有继承关系的子类中
	  * 2、方法名相同，参数列表相同（参数顺序、个数、类型），方法返回值相同
	  * 3、访问修饰符，访问范围需要大于等于父类的访问范围
	  * 4、与方法的参数名无关
      * 5、当方法返回值是void或基本数据类型时，必须相同；当返回值是引用类型时，可以是父类或其子类
	  * */
	 
//	 private String sleep(String name){
//		 return "";
//	 }
//	 public void sleep(String name,int month){
//		 
//	 }
//	 public void sleep(int month,String name){
//		 
//	 }
//	 public void sleep(int name,String month){
//		 
//	 }
	 
	 //子类重写父类吃东西方法
//	 public void eat(){
//		 System.out.println(this.getName()+"最近没有食欲~~");
//	 }
	 
	 public void eat(String month){
		 System.out.println(month+"最近没有食欲~~");
	 }


     public Cat jump() {
        System.out.println("狗狗是助跑式跳跃~");
        return new Cat();
     }

	 @Override
	 public void eat() {
		 System.out.println("这是我狗类独有的吃东西方法");
	 }
}
