package Method;

import java.util.Scanner;

public class ArraySearch {

	//查找数组元素值的方法
	public boolean search(int n,int[] arr){
		boolean flag=false;//默认是没找到
		for(int i=0;i<arr.length;i++){
			if(arr[i]==n){
				flag=true;//找到了
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		int[] arr1={10,20,30,40,50,60};
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要查找的数据:");
		int n1=sc.nextInt();
		ArraySearch as=new ArraySearch();
		boolean flag=as.search(n1, arr1);
		if(flag){
			System.out.println("找到了！");
		}else{
			System.out.println("没找到！");
		}
	}

}
