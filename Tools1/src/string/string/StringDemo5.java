package string.string;

public class StringDemo5 {

	public static void main(String[] args) {
		// ==��equals����������
		//���������ַ��������ݶ���
		String str1="flowerchar";
		String str2="flowerchar";
		String str3=new String("flowerchar");
		System.out.println("str1��str2��������ͬ��"+(str1.equals(str2)));
		System.out.println("str1��str3��������ͬ��"+(str1.equals(str3)));
		
		System.out.println("str1��str2�ĵ�ַ��ͬ��"+(str1==str2));
		System.out.println("str1��str3�ĵ�ַ��ͬ��"+(str1==str3));
		
	}

}
