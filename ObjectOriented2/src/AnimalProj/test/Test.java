package AnimalProj.test;

import AnimalProj.animal.Animal;
import AnimalProj.animal.Cat;
import AnimalProj.animal.Dog;

public class Test {

	public static void main(String[] args) {
		Cat one=new Cat();
		one.setName("����");
		one.setSpecies("�л���԰è");
		one.eat();
		one.run();
		System.out.println(one.temp);
		System.out.println("===================");
		Dog two=new Dog();
		two.setName("����1");
		two.setMonth(1);
		two.eat();
		two.sleep();
		System.out.println("===================");
		two.eat("����");
		System.out.println("===================");
//		Animal three=new Animal();
//		three.setMonth(2);
//		three.setSpecies("è�ƶ���");
//		three.name;
//		three.run();
//		three.sleep();
	}

}
