package SetSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSort {

	public static void main(String[] args) {
		// �Դ����List�е��ַ�����������
		List<String> list=new ArrayList<String>();
		list.add("orange");
		list.add("blue");
		list.add("yellow");
		list.add("gray");
		System.out.println("����ǰ��");
		for(String s:list){
			System.out.print(s+"   ");
		}
		System.out.println();
		Collections.sort(list);
		System.out.println("�����");
		for(String s:list){
			System.out.print(s+"   ");
		}
	}

}
