package SelectStructure;

import java.util.Scanner;

public class WeekDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ʾ���ڵ�Ӣ�ĵ��ʣ�");
		String week = sc.next();
		week=week.toUpperCase();//���ַ����е��ַ�ȫ����Ϊ��д
		switch (week) {
		case "MONDAY":
			System.out.println("����һ");break;
		case "TUESDAY":
			System.out.println("���ڶ�");break;
		case "WEDNESDAY":
			System.out.println("������");break;
		case "THURSDAY":
			System.out.println("������");break;
		case "FRIDAY":
			System.out.println("������");break;
		case "SATURDAY":
			System.out.println("������");break;
		case "SUNDAY":
			System.out.println("������");break;
		default:
			System.out.println("�����������");
		}
	}

}
