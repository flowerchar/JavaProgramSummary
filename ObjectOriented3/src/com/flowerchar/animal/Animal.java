package com.flowerchar.animal;

//�����ࣺ������ʵ����������ͨ������ת�ͣ�ָ������ʵ��
public class Animal {
	//���ԣ��ǳơ�����
	private String name;
	private int month;
	
	public Animal(){
		
	}
	
	public Animal(String name,int month){
		this.name=name;
		this.month=month;
	}

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
	
	//�������Զ���
	//���󷽷�����������������壻��������Ҫ��д����ĳ��󷽷�,��������Ҳ�ǳ�����
	//static final private������abstract����
	public  void eat(){
		System.out.println("������Ҫ�Զ���");
	}
	public void eat(int a){

	}
	public static void say(){
		System.out.println("�������к�");
	}
}
