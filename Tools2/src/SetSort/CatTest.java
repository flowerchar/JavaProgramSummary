package SetSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatTest {

	public static void main(String[] args) {
		// 按名字升序排序
		Cat huahua=new Cat("huahua",5,"英国短毛猫");
		Cat fanfan=new Cat("fanfan",2,"中华田园猫");
		Cat maomao=new Cat("maomao",3,"中华田园猫");
		List<Cat> catList=new ArrayList<Cat>();
		catList.add(huahua);
		catList.add(fanfan);
		catList.add(maomao);
		//排序前
		System.out.println("排序前：");
		for(Cat cat:catList){
			System.out.println(cat);
		}
		//按名字进行升序排序
		Collections.sort(catList, new NameComparator());
		System.out.println("按名字升序排序后：");
		for(Cat cat:catList){
			System.out.println(cat);
		}
		//按年龄进行降序排序
		Collections.sort(catList, new AgeComparator());
		System.out.println("按年龄降序排序后：");
		for(Cat cat:catList){
			System.out.println(cat);
		}
	}

}
