package Method;

public class ArrayMethod {
	//打印输出数组元素的值
	public void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"      ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr={10,20,30,40,50};
		ArrayMethod am=new ArrayMethod();
		am.printArray(arr);
	}

}
