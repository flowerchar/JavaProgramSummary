package Method;

public class MathDemo {

	//������int�������ĺ�
	public int plus(int m,int n){
		return m+n;
	}
	//������double�������ĺ�
	public double plus(double m,double n){
		return m+n;
	}
	//������Ԫ�ص��ۼӺ�
	public int plus(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		return sum;
	}

	public String plus(String a, String b){
		return a+b;
	}
	public static void main(String[] args) {
//		int m=5,n=10;
//		int[] arr={1,2,3,4,5,6};
//		MathDemo mathDemo=new MathDemo();
//		System.out.println("int���͵ĺͣ�"+mathDemo.plus(m, n));
//		System.out.println("double���͵ĺͣ�"+mathDemo.plus(5.6, 7.8));
//		System.out.println("����Ԫ�صĺͣ�"+mathDemo.plus(arr));
//		System.out.println(mathDemo.plus("11", "22"));
		try {
			int a=1, b=0;
			int i = a / b;
		}catch (ArithmeticException e){
			System.out.println("��������");
		}catch (Exception e){
			System.out.println("aa");
		}
//		int a=1, b=0;
//		int i = a / b;
	}

}
