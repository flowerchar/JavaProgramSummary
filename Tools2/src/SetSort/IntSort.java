package SetSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntSort {

	public static void main(String[] args) {
		// �Դ洢��List�е��������ݽ�������
		List<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(9);
		list.add(3);
		list.add(1);
		System.out.println("����ǰ��");
		for(int n:list){
			System.out.print(n+"    ");
		}
		System.out.println();
		//��List�е����ݽ�������
		Collections.sort(list);
		System.out.println("�����");
		for(int n:list){
			System.out.print(n+"    ");
		}

	}

}
