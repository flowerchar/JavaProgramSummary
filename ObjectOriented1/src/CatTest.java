//单一职责原则
public class CatTest {
	public static void main(String[] args) {
		// 对象实例化

//		Cat one = new Cat("花花",2,1000,"英国短毛猫");
		Cat one=new Cat();
	    // 测试
		one.name = "花花";
		one.month = 2;
		one.weight = 1000;
		one.species = "英国短毛猫";
		
		System.out.println("昵称：" + one.name);
		System.out.println("年龄：" + one.month);
		System.out.println("体重：" + one.weight);
		System.out.println("品种：" + one.species);
		one.run();
		one.Cat();

		Cat two = new Cat();
		Cat three = two;
		System.out.println(two.name);
	}
}
