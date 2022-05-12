package SetSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSort {

	public static void main(String[] args) {
		// 对存放在List中的字符串进行排序
		List<String> list=new ArrayList<String>();
		list.add("orange");
		list.add("blue");
		list.add("yellow");
		list.add("gray");
		System.out.println("排序前：");
		for(String s:list){
			System.out.print(s+"   ");
		}
		System.out.println();
		Collections.sort(list);
		System.out.println("排序后：");
		for(String s:list){
			System.out.print(s+"   ");
		}
	}

}
