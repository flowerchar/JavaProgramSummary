package Method;

public class MaxDemo {
	public float a;
	public float b;
	//�����ֵ�ķ���
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
		System.out.println("������"+a+"��"+b+"�����ֵΪ��"+max);
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
