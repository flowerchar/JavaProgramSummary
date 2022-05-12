package jihe.jiheTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordDemo {

	public static void main(String[] args) {
		// 将英文单词添加到HashSet中
		Set<String> set = new HashSet();
		// 向集合中添加元素
		set.add("blue");
		set.add("red");
		set.add("black");
		set.add("yellow");
		set.add("white");
		// 显示集合的内容
		System.out.println("集合中的元素为：");
		Iterator it = set.iterator();
		// 遍历迭代器并输出元素
		while (it.hasNext()) {
			System.out.print(it.next() + "   ");
		}
		System.out.println();
		// 在集合中插入一个新的单词
		set.add("green");
		set.add("white");
		it = set.iterator();
		// 遍历迭代器并输出元素
		System.out.println("**************************");
		System.out.println("插入重复元素后的输出结果为：");
		while (it.hasNext()) {
			System.out.print(it.next() + "   ");
		}

	}

}
