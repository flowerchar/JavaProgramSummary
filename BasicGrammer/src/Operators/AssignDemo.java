package Operators;

import java.text.DecimalFormat;

public class AssignDemo {

	public static void main(String[] args) {
		// �������������ʼ���۸�Ϊ���ӵ�ԭ��
		float price=19.8F;
		System.out.println("���ӵ�ԭ��Ϊ��"+price);
		//price=price*((float)0.8);
		price*=0.8;
		System.out.println("���Ӵ���֮��ļ۸�Ϊ��"+price);
		
		//�۸���һλС��
		DecimalFormat df=new DecimalFormat("0.0");//#.#
		//String s=df.format(price);
		//System.out.println("����һλС����ļ۸�"+s);
		System.out.println("����һλС����ļ۸�Ϊ��"+df.format(price));
	}

}
