package animal;


//��һְ��ԭ��
public class CatTest {
    public static void main(String[] args) {
        // ����ʵ����
        Cat one = new Cat(3);
        // ����
//         one.setName("����");
//         one.setMonth(0); //=-3;
//         one.weight = 1200;
//         one.species = "�л���԰è";

         System.out.println("�ǳƣ�" + one.getName());
        if (one.getMonth() == 0)
            return;
        System.out.println("���䣺" + one.getMonth());
        // System.out.println("���أ�" + one.weight);
        // System.out.println("Ʒ�֣�" + one.species);
        System.out.println(new Cat().price);
        System.out.println(Cat.price);


//        System.out.println("lllllllllllllllll");

    }
}
