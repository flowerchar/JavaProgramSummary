package jihe.jiheTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordDemo {

	public static void main(String[] args) {
		// ��Ӣ�ĵ�����ӵ�HashSet��
		Set<String> set = new HashSet();
		// �򼯺������Ԫ��
		set.add("blue");
		set.add("red");
		set.add("black");
		set.add("yellow");
		set.add("white");
		// ��ʾ���ϵ�����
		System.out.println("�����е�Ԫ��Ϊ��");
		Iterator it = set.iterator();
		// ���������������Ԫ��
		while (it.hasNext()) {
			System.out.print(it.next() + "   ");
		}
		System.out.println();
		// �ڼ����в���һ���µĵ���
		set.add("green");
		set.add("white");
		it = set.iterator();
		// ���������������Ԫ��
		System.out.println("**************************");
		System.out.println("�����ظ�Ԫ�غ��������Ϊ��");
		while (it.hasNext()) {
			System.out.print(it.next() + "   ");
		}

	}

}
