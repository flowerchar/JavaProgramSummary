package jihe.jiheTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTest {

    public static void main(String[] args) {
        // 定义宠物猫对象
        Cat huahua = new Cat("花花", 12, "英国短毛猫");
        Cat fanfan = new Cat("凡凡", 3, "中华田园猫");
        // 将宠物猫对象放入HashSet中
        Set<Cat> set = new HashSet<Cat>();
        set.add(huahua);
        set.add(fanfan);
        // 显示宠物猫信息
        Iterator<Cat> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 再添加一个与花花属性一样的猫
        Cat huahua01 = new Cat("花花", 12, "英国短毛猫");
        set.add(huahua01);
        System.out.println("**********************************");
        System.out.println("添加重复数据后的宠物猫信息：");
        it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("**********************************");
        // 重新插入一个新宠物猫
        Cat huahua02 = new Cat("花花二代", 2, "英国短毛猫");
        set.add(huahua02);
        System.out.println("添加花花二代后的宠物猫信息：");
        it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("**********************************");
        // 在集合中查找花花的信息并输出
        if (set.contains(huahua)) {
            System.out.println("花花找到了！");
            System.out.println(huahua);
        } else {
            System.out.println("花花没找到！");
        }
        // 在集合中使用名字查找花花的信息
        System.out.println("**********************************");
        System.out.println("通过名字查找花花信息");
        boolean flag = false;
        Cat c = null;
        it = set.iterator();
        while (it.hasNext()) {
            c = it.next();
            if (c.getName().equals("花花")) {
                flag = true;// 找到了
                break;
            }
        }
        if (flag) {
            System.out.println("花花找到了");
            System.out.println(c);
        } else {
            System.out.println("花花没找到");
        }

        // 删除花花二代的信息并重新输出
        for (Cat cat : set) {
            if ("花花二代".equals(cat.getName())) {
                set.remove(cat);
                break;
            }
        }
        System.out.println("**********************************");

        System.out.println("删除花花二代后的数据");
        for(Cat cat:set){
            System.out.println(cat);
        }
        //删除集合中的所有宠物猫信息
        System.out.println("**********************************");
        boolean flag1=set.removeAll(set);
        if(set.isEmpty()){
            System.out.println("猫都不见了。。。");
        }else{
            System.out.println("猫还在。。。");
        }

        if (flag1){
            System.out.println("删除成功");
        }
    }
}
