package PackageClass.wrap;

public class WrapTestTwo {

	public static void main(String[] args) {

		//������������ת��Ϊ�ַ���
		int t1=2;
		String t2=Integer.toString(t1);
		//����
		System.out.println("int����ת��ΪString���Ͷ���t2="+t2);
		System.out.println("********************************");
		//�ַ���ת��Ϊ������������
		//1����װ���parse
		int t3=Integer.parseInt(t2);
		//2����װ���valueOf �Ƚ��ַ���ת��Ϊ��װ�࣬��ͨ���Զ�������ɻ�������ת��
		int t4=Integer.valueOf(t2);
		//����
		System.out.println("String����ת��Ϊint���ͱ���t3="+t3);
		System.out.println("String����ת��Ϊint���ͱ���t4="+t4);
		
		
	}

}
