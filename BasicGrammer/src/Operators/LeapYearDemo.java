package Operators;

import java.util.Scanner;

public class LeapYearDemo {

	public static void main(String[] args) {
		System.out.println("��������ݣ�");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		//������жϹ����ܱ�4���������ܱ�100��������ݣ������ܱ�400���������
		if(((year%4==0)&(year%100!=0))|(year%400==0)){
			System.out.println(year+"�����꣡");
		}else{
			System.out.println(year+"�������꣡");
		}

	}

}
