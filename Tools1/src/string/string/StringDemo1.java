package string.string;

import java.util.ArrayList;
import java.util.List;

public class StringDemo1 {

	public static void main(String[] args) {
		//����һ���ַ���"JAVA ��� ����"
		String str="AJVA ��� ����";
		//��ӡ����ַ����ĳ���
		System.out.println("�ַ����ĳ����ǣ�"+str.length());

		//ȡ���ַ�'��'�����
		System.out.println(str.charAt(6));
		
		//ȡ���Ӵ�"��� ����"�����
		System.out.println(str.substring(5));
		
		//ȡ���Ӵ�"���"�����
		System.out.println(str.substring(5, 7));
		

		
	}

}
