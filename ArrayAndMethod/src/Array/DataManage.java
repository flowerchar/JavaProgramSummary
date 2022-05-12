package Array;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * �Ӽ��̽����������ݴ�ŵ������У����������е����ݽ��й���
 * @author lwl
 * @version 1.0
 * @since 2022
 */
public class DataManage {

	/**
	 * �Ӽ��̽�������
	 * 
	 * @return �������ݵ�����
	 */
	public int[] insertData() {
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);
		// �ٽ���һ�����ݣ�Ϊ��ָ��λ�ô�����������׼��
		for (int i = 0; i < a.length - 1; i++) {
			System.out.println("�������" + (i + 1) + "�����ݣ�");
			try {
				a[i] = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("��������ݸ�ʽ���󣬲����з����֣�");
				sc.next();
				i--;
			}
		}
		return a;
	}

	/**
	 * ��ʾ������Ԫ�ص�����
	 * 
	 * @param a
	 *            ����
	 * @param length
	 *            Ҫ��ʾ������Ԫ�صĸ���
	 */
	public void showData(int[] a, int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(a[i] + "     ");
		}
		System.out.println();
	}

	/**
	 * �Ӽ��̽���һ�����ݣ����뵽�����ָ��λ�ô�
	 * 
	 * @param a
	 *            Ҫ�������ݵ�����
	 * @param n
	 *            Ҫ���������
	 * @param k
	 *            Ҫ�����λ�ã���0��ʼ
	 */
	public void insertAtArray(int[] a, int n, int k) {
		// ע������һ�����ݿ�ʼ�ƶ����������ݸ���
		for (int i = a.length - 1; i > k; i--) {
			a[i] = a[i - 1];
		}
		a[k] = n;
	}

	/**
	 * ����������ܱ�3������Ԫ��
	 * 
	 * @param a
	 */
	public void divThree(int[] a) {
		String str = "";
		int count = 0;
		for (int n : a) {
			if (n % 3 == 0) {
				str = str + n + "   ";
				count++;
			}
		}
		if (count == 0) {
			System.out.println("������û���ܱ�3������Ԫ�أ�");
		} else {
			System.out.println("�������ܱ�3������Ԫ��Ϊ��" + str);
		}
	}

	/**
	 * ��ʾ��Ϣ
	 */
	public void notice() {
		System.out.println("********************************************");
		System.out.println("                1--��������");
		System.out.println("                2--��ʾ��������");
		System.out.println("                3--��ָ��λ�ô���������");
		System.out.println("                4--��ѯ�ܱ�3����������");
		System.out.println("                0--�˳�");
		System.out.println("********************************************");
	}

//	public DataManage(){}
	public static void main(String[] args) {
		DataManage dm = new DataManage();
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int[] a=null;
		int n=0,k=0;//n��ʾҪ��������ݣ�k��ʾ����λ��
		while (true) {
			dm.notice();
			System.out.println("�������Ӧ�����ֽ��в�����");
			try{
			input = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("��������ݸ�ʽ���󣬲����з����֣�");
				sc.next();
				continue;
			}
			if (input == 0) {
				System.out.println("�˳�����");
				break;
			}
			switch (input) {
			case 1:
				//��������
				a=dm.insertData();
				//��ʾ����
				System.out.println("����Ԫ��Ϊ��");
				dm.showData(a, a.length-1);
				break;
			case 2:
				if(a!=null){
					System.out.println("����Ԫ��Ϊ��");
					if(a[a.length-1]==0){
						//�����������һ��Ԫ��Ϊ0��˵����û�в������ݣ���˲���ʾ���һ��Ԫ��
						dm.showData(a, a.length-1);
					}else{
						dm.showData(a, a.length);
					}
				}else{
					System.out.println("��δ�������в������ݣ�������ѡ�������");
				}
				break;
			case 3:
				//��ָ��λ�ô���������
				if(a!=null){
					System.out.println("������Ҫ��������ݣ�");
					try{
					n=sc.nextInt();
					System.out.println("������Ҫ�������ݵ�λ�ã�");
					k=sc.nextInt();
					}catch(InputMismatchException e){
						System.out.println("��������ݸ�ʽ���󣬲����з����֣�");
						sc.next();
						break;
					}
					dm.insertAtArray(a, n, k);
					dm.showData(a, a.length);
				}else{
					System.out.println("��δ�������в������ݣ�������ѡ�������");
				}
				break;
			case 4: 
				//��ѯ�������ܱ�3������Ԫ��
				if(a!=null){
					dm.divThree(a);
				}else{
					System.out.println("��δ�������в������ݣ�������ѡ�������");
				}
				break;
			}
		}
	}

}
