package com.flowerchar.animal;

public class Cat extends Animal {
	//���ԣ�����
	private double weight;
	
	public Cat(){
		
	}
	
	public Cat(String name,int month,double weight){
		super(name,month);
//		this.setMonth(month);
		this.weight=weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	//�������ܶ�
	public void run(){
		System.out.println("Сè���ֵı���");
	}
	
	
	//�������Զ�������д���෽����
	@Override
	public void eat() {
		System.out.println("è����~~");
	}

//	public void eat()

	public static void say(){
		System.out.println("Сè������");
	}

	public void playBall() {
		// TODO Auto-generated method stub
		System.out.println("Сèϲ��������");
	}
}
