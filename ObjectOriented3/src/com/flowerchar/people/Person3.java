package com.flowerchar.people;

/*
 * 1�������ڷ����ڲ������÷�ΧҲ�ڷ�����
 * 2���ͷ����ڲ���Աʹ�ù���һ����classǰ�治�������public��private��protected��static
 * 3�����в��ܰ�����̬��Ա
 * 4�����п��԰���final��abstract���εĳ�Ա
 */
public class Person3 {
    public static int age;

    public Object getHeart(){
        class Heart3 {
            public int age=13;
            int temp=22;
            public String beat(){
                return Person3.age+"����������";
            }
            public  void say(){
                System.out.println("hello");
            }
        }
        return new Heart3().beat();
    }

    public void eat(){
        System.out.println("�˻�Զ���");
    }

}
