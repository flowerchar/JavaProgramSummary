package ConstantAndVariable;
public class TypeExchange {

	public static void main(String[] args) {
		//char���ͺ�int����֮���ת��
		char c=(char)65536;
		int n;
		n=c;//��ʽ����ת��
		System.out.println(n);
		c=(char)n;
		System.out.println(c);
		
		//���ͺ͸����͵�����ת������
		int x=100;
		long y=x;
		x=(int)y;
		float f=100000000000000L;
		System.out.println("f="+f);
		float f1=103948583923948L;
		System.out.println("f1="+f1);

	}

}
