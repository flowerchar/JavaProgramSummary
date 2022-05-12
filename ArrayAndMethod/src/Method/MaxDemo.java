package Method;

public class MaxDemo {
	public float a;
	public float b;
	//求最大值的方法
//	public MaxDemo(float a, float b){
//		this.a = a;
//		this.b = b;
//	}
	public void max(float a, float b){
		float max;
		if(a>b){
			max=a;
		}else{
			max=b;
		}
		System.out.println("两个数"+a+"和"+b+"的最大值为："+max);
	}
	public static void main(String[] args) {
		MaxDemo maxDemo=new MaxDemo();
		int a=5,b=3;
		maxDemo.max(a, b);
//		float m=5.6f,n=8.9f;
//		maxDemo.max(m, n);
//		maxDemo.max(9.8f, 12.8f);
//		maxDemo.max(1.2, 3.4);

	}

}
