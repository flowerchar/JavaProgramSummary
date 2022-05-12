package AnimalProj.test;

import AnimalProj.animal.Animal;
import AnimalProj.animal.Cat;
import AnimalProj.animal.Dog;

public class Test {

	public static void main(String[] args) {
		Cat one=new Cat();
		one.setName("花花");
		one.setSpecies("中华田园猫");
		one.eat();
		one.run();
		System.out.println(one.temp);
		System.out.println("===================");
		Dog two=new Dog();
		two.setName("狗子1");
		two.setMonth(1);
		two.eat();
		two.sleep();
		System.out.println("===================");
		two.eat("凡凡");
		System.out.println("===================");
//		Animal three=new Animal();
//		three.setMonth(2);
//		three.setSpecies("猫科动物");
//		three.name;
//		three.run();
//		three.sleep();
	}

}
