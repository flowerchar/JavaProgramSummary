package Array;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// ������������ۼӺ�
		//������������
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		//�Ӽ��̽������ݣ�Ϊ����Ԫ�ظ�ֵ
		for(int i=0;i<a.length;i++){
			System.out.println("�������"+(i+1)+"��Ԫ�أ�");
			a[i]=sc.nextInt();
		}
		System.out.println("����Ԫ�ص�����Ϊ��");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"     ");
		}
		System.out.println();
		System.out.println("ʹ����ǿ��forѭ������������ݣ�");
		for(int n:a){
			System.out.print(n+"    ");
		}
		//������Ԫ�ص��ۼӺ�
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
//		for (int j:a
//			 ) {
//			sum += j;
//		}
//		{34,23,78,56,31}
		System.out.println();
		System.out.println("\n����Ԫ�ص��ۼӺ�Ϊ��"+sum);
	}

}
