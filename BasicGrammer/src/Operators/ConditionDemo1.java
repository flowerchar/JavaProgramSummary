package Operators;

public class ConditionDemo1 {

	public static void main(String[] args) {
		// �̳����ۣ����������Ʒ�ļ۸����100���20������ԭ�ۺ��ۺ�۸�ֱ������
		//���������������ֱ��������·��ļ۸�
		double price1,price2;
		price1=80;
		price2=55;
		//����������Ʒ���ܼ۸�
		double sum=price1+price2;
		//���ԭ��
		System.out.println("ԭ��Ϊ��"+sum);
		if(sum>=100){
			sum-=20;//sum=sum-20;
		}
		System.out.println("�ۺ�۸�Ϊ��"+sum);
	}

}
