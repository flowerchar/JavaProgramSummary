package SetSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatTest {

	public static void main(String[] args) {
		// ��������������
		Cat huahua=new Cat("huahua",5,"Ӣ����ëè");
		Cat fanfan=new Cat("fanfan",2,"�л���԰è");
		Cat maomao=new Cat("maomao",3,"�л���԰è");
		List<Cat> catList=new ArrayList<Cat>();
		catList.add(huahua);
		catList.add(fanfan);
		catList.add(maomao);
		//����ǰ
		System.out.println("����ǰ��");
		for(Cat cat:catList){
			System.out.println(cat);
		}
		//�����ֽ�����������
		Collections.sort(catList, new NameComparator());
		System.out.println("���������������");
		for(Cat cat:catList){
			System.out.println(cat);
		}
		//��������н�������
		Collections.sort(catList, new AgeComparator());
		System.out.println("�����併�������");
		for(Cat cat:catList){
			System.out.println(cat);
		}
	}

}
