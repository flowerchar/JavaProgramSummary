package string.string;

public class StringDemo6 {

	public static void main(String[] args) {
		//String�Ĳ��ɱ���
		//String����һ���������������޸ģ��ǲ��ɱ��
		//��ν���޸���ʵ�Ǵ������µĶ�����ָ����ڴ�ռ䲻��
		String s1="flowerchar";
		String s2="hello,"+s1;
		//s1����ָ��flowerchar���ڵ��ڴ�ռ䣬����ָ����"hello,flowerchar"
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);

		String s3=new String("hello,flowerchar!");
		System.out.println("�Ӵ�:"+s3.substring(0,5));
		System.out.println("s3="+s3);
	}

}
