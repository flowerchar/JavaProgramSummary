package com.flowerchar.people;

/**
 * @apiNote ��Ա�ڲ���
 */
//	           * 1���ڲ������ⲿʹ��ʱ���޷�ֱ��ʵ��������Ҫ�����ⲿ����Ϣ�������ʵ����
//             * 2���ڲ���ķ������η����������⣬���Ƿ��ʷ�Χ���ܵ�Ӱ��
//             * 3���ڲ������ֱ�ӷ����ⲿ��ĳ�Ա���������ͬ�����ԣ����ȷ����ڲ����ж����
//             * 4������ʹ���ⲿ��.this.��Ա�ķ�ʽ�������ⲿ����ͬ������Ϣ
//             * 5���ⲿ������ڲ�����Ϣ����Ҫͨ���ڲ���ʵ�����޷�ֱ�ӷ���
//             * 6���ڲ�������.class�ļ��������ⲿ��$�ڲ���.class
public class Person1 {

    public int age;

    public Heart1 getHeart(){
        new Heart1().temp=12;
//        temp=33;
        return new Heart1();
    }

    public void eat(){

        System.out.println("�˻�Զ���");
    }
    public class Heart1 {
        int age=13;
        int temp=22;
        public String beat(){
            eat();
            return Person1.this.age+"����������";
        }
    }
}
