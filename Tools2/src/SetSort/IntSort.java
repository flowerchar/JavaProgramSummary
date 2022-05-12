package SetSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntSort {

	public static void main(String[] args) {
		// 对存储在List中的整型数据进行排序
		List<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(9);
		list.add(3);
		list.add(1);
		System.out.println("排序前：");
		for(int n:list){
			System.out.print(n+"    ");
		}
		System.out.println();
		//对List中的数据进行排序
		Collections.sort(list);
		System.out.println("排序后：");
		for(int n:list){
			System.out.print(n+"    ");
		}

	}

}
