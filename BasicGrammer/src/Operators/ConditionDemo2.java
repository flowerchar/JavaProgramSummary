package Operators;

import java.util.Scanner;

public class ConditionDemo2 {

	public static void main(String[] args) {
		// �ж�һ����������������ż�������������ӡ�����
		//����һ�������������
		//int n=11;
		//�Ӽ��̽�������
		System.out.println("������һ��������");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%2==0)
		{
			System.out.println(n+"��ż����");
		}else{
			System.out.println(n+"��������");
		}

	}

}
