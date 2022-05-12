package Array;

/**
 * @author DELL
 */
public class  SortDemo {

	public static void main(String[] args) {
		//冒泡排序
		int[] a={34,53,12,32,56,17};
		// 34 12 32 53 17 56
		// 12 32 34 17 53 56
		// 12 32 17 34 53 56
		// 12 17 32 34 53 56
		// 12 17 32 34 53 56
		System.out.println("排序前的数组元素为:");
		for(int n:a){
			System.out.print(n+"     ");
		}
		System.out.println();
		int temp;
		for(int i=0;i<a.length-1;i++){
			//内重循环控制每趟排序
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("从小到大排序后的数组元素为：");
		for(int n:a){
			System.out.print(n+"     ");
		}

	}

}
