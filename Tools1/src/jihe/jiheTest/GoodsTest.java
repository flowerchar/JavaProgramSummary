package jihe.jiheTest;

import java.util.*;

public class GoodsTest {
    public static void main(String[] args) {

	Scanner console = new Scanner(System.in);
	// ����HashMap����
	Map<String, Goods> goodsMap = new HashMap<String, Goods>();
		System.out.println("������������Ʒ��Ϣ��");
		int i = 0;
		while (i < 3) {
			System.out.println("�������" + (i + 1) + "����Ʒ��Ϣ��");
			System.out.println("��������Ʒ��ţ�");
			String goodsId = console.next();
			// �ж���Ʒ���id�Ƿ����
			if (goodsMap.containsKey(goodsId)) {
				System.out.println("����Ʒ����Ѿ����ڣ����������룡");
				continue;
			}
			System.out.println("��������Ʒ���ƣ�");
			String goodsName = console.next();
			System.out.println("��������Ʒ�۸�");
			double goodsPrice = 0;
			try {
				goodsPrice = console.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("��Ʒ�۸�ĸ�ʽ����ȷ��������˫������ֵ�����ݣ�");
				console.next();
				continue;
			}
			Goods goods = new Goods(goodsId, goodsName, goodsPrice);
			// ����Ʒ��Ϣ��ӵ�HashMap��
			goodsMap.put(goodsId, goods);
			i++;
		}
		// ����Map,�����Ʒ��Ϣ
		System.out.println("��Ʒ��ȫ����ϢΪ��");
		Iterator<Goods> itGoods = goodsMap.values().iterator();
		while (itGoods.hasNext()) {
			System.out.println(itGoods.next());
		}
    }
}
