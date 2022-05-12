package SetSort;

import java.util.Comparator;

public class AgeComparator implements Comparator<Cat>{

	@Override
	public int compare(Cat o1, Cat o2) {
		// 按年龄降序排序
		int age1=o1.getMonth();
		int age2=o2.getMonth();
		return age2-age1;
	}

}
