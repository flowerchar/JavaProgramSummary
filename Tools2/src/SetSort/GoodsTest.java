package SetSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsTest {

	public static void main(String[] args) {
		Goods g1 = new Goods("s00001", "�ֻ�", 2000);
		Goods g2 = new Goods("s00002", "����", 5000);
		Goods g3 = new Goods("s00003", "���ӻ�", 3000);
		List<Goods> goodsList = new ArrayList<Goods>();
		goodsList.add(g1);
		goodsList.add(g2);
		goodsList.add(g3);
		// ����ǰ
		System.out.println("����ǰ��");
		for (Goods goods : goodsList) {
			System.out.println(goods);
		}
		Collections.sort(goodsList);
		// �����
		System.out.println("�����");
		for (Goods goods : goodsList) {
			System.out.println(goods);
		}

	}

}
