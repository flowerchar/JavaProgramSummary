package SelectStructure;

import java.util.Scanner;

public class WeekDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入1-7之间的数字：");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("星期一");break;
		case 2:
			System.out.println("星期二");break;
		case 3:
			System.out.println("星期三");break;
		case 4:
			System.out.println("星期四");break;
		case 5:
			System.out.println("星期五");break;
		case 6:
			System.out.println("星期六");break;
		case 7:
			System.out.println("星期日");break;
		default:
			System.out.println("该数字超出了1-7的范围！");
		}

	}

}
