package Method;

import java.util.Scanner;

public class ArraySearch {

	//��������Ԫ��ֵ�ķ���
	public boolean search(int n,int[] arr){
		boolean flag=false;//Ĭ����û�ҵ�
		for(int i=0;i<arr.length;i++){
			if(arr[i]==n){
				flag=true;//�ҵ���
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		int[] arr1={10,20,30,40,50,60};
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫ���ҵ�����:");
		int n1=sc.nextInt();
		ArraySearch as=new ArraySearch();
		boolean flag=as.search(n1, arr1);
		if(flag){
			System.out.println("�ҵ��ˣ�");
		}else{
			System.out.println("û�ҵ���");
		}
	}

}
