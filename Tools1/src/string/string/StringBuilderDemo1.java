package string.string;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		// ����һ���ַ���"���"
		StringBuilder str=new StringBuilder("���");
		//��"���"����������ݣ����ַ������"��ã�flowerchar!"
	    str.append(',');
	    str.append("flowerchar!");
	    System.out.println("str="+str);
		System.out.println("str="+str.append(',').append("flowerchar!"));

		//���ַ������"���,flowerchar��"
		//���ַ�ʽ��
		//1��ʹ��delete����ɾ��mooc��Ȼ���ڲ���MOOC
		System.out.println("�滻��"+str.delete(4, 8).insert(4, "MOOC"));
		//2��ʹ��replace����ֱ���滻
		System.out.println("�滻��"+str.replace(4, 8, "MOOC"));
		
		//���ַ���"��ã�flowerchar"��ȡ��"���"�����
		System.out.println(str.substring(0,2));


	}

}
