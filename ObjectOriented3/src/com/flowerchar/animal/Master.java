package com.flowerchar.animal;

public class Master {
	/*ι����
	 * ιè�䣺���궫�������˻����ȥ������
	 * ι���������궫�������˻���Ź���ȥ˯��
	 * �����ӡ������ġ����ڹꡣ������
	 */
	//����1����д���������벻ͬ���͵Ķ�����ø��Եķ���
//	public void feed(Cat cat){
//		cat.eat();
//		cat.playBall();
//	}
//
//	public void feed(Dog dog){
//		dog.eat();
//		dog.sleep();
//	}
	//����2����д�������붯��ĸ��࣬������ͨ������ת��������ָ������ķ���
	public void feed(Animal obj){
		obj.eat();
		if(obj instanceof Cat){
			Cat temp=(Cat)obj;
			temp.playBall();
		}else if(obj instanceof Dog){
			Dog temp=(Dog)obj;
			temp.sleep();
		}
	}
	
	/*
	 * �������ֳ���
	 * ����ʱ��ࣺ������
	 * ����ʱ�䲻��:��è��
	 */
	//����1��
//	public Dog hasManyTime(){
//		System.out.println("��������ʱ��Ƚϳ��㣬�ʺ�������");
//		return new Dog();
//	}
//	public Cat hasLittleTime(){
//		System.out.println("����ƽʱ�Ƚ�æµ���ʺ���è��");
//		return new Cat();
//	}
	//����2��Animal == Dog
	public Animal raise(boolean isManyTime){
		if(isManyTime){
			System.out.println("��������ʱ��Ƚϳ��㣬�ʺ�������");
			return new Dog();
		}else{
			System.out.println("����ƽʱ�Ƚ�æµ���ʺ���è��");
			return new Cat();
		}
	}
}









