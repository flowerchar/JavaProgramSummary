package animal;


//单一职责原则
public class CatTest {
    public static void main(String[] args) {
        // 对象实例化
        Cat one = new Cat(3);
        // 测试
//         one.setName("凡凡");
//         one.setMonth(0); //=-3;
//         one.weight = 1200;
//         one.species = "中华田园猫";

         System.out.println("昵称：" + one.getName());
        if (one.getMonth() == 0)
            return;
        System.out.println("年龄：" + one.getMonth());
        // System.out.println("体重：" + one.weight);
        // System.out.println("品种：" + one.species);
        System.out.println(new Cat().price);
        System.out.println(Cat.price);


//        System.out.println("lllllllllllllllll");

    }
}
