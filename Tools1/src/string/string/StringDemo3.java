package string.string;

import java.io.UnsupportedEncodingException;

public class StringDemo3 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// �ַ�����byte����֮����໥ת��
		//����һ���ַ���
		String str=new String("JAVA ��� ����");
		//���ַ���ת��Ϊbyte���飬����ӡ���
		byte[] arrs=str.getBytes("GBK");
		for(int i=0;i<arrs.length;i++){
			System.out.print(arrs[i]+" ");
		}

		System.out.println();
		//��byte����ת��Ϊ�ַ���
		String str1=new String(arrs,"GBK");
		System.out.println(str1);
		
	}

}
