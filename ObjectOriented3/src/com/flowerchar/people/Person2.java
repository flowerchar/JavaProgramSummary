package com.flowerchar.people;

/**
 * @apiNote ��̬�ڲ���
 */
/*
 * 1����̬�ڲ����У�ֻ��ֱ�ӷ����ⲿ��ľ�̬��Ա�������Ҫ���÷Ǿ�̬��Ա������ͨ������ʵ��
 * 2����̬�ڲ������ʵ��ʱ�����Բ��������ⲿ�����
 * 3������ͨ���ⲿ��.�ڲ���.��̬��Ա�ķ�ʽ�������ڲ����еľ�̬��Ա
 * 4�����ڲ����������ⲿ������ͬ��ʱ��Ĭ��ֱ�ӵ����ڲ����еĳ�Ա��
 * �����Ҫ�����ⲿ���еľ�̬���ԣ������ͨ�� �ⲿ��.���� �ķ�ʽ��
 * �����Ҫ�����ⲿ���еķǾ�̬���ԣ������ͨ�� new �ⲿ��().���Եķ�ʽ��
 */
public class Person2 {
    public int age;

    public Heart2 getHeart(){
        return new Heart2();
    }

    public void eat(){
        System.out.println("�˻�Զ���");
    }
    public static class Heart2 {
        static int age=13;
        int temp=22;
        public String beat(){
            new Person2().eat();
            return new Person2().age+"����������";
        }
        public static void say(){
            System.out.println("hello");
        }
    }
}
