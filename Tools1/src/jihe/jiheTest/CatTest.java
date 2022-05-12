package jihe.jiheTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTest {

    public static void main(String[] args) {
        // �������è����
        Cat huahua = new Cat("����", 12, "Ӣ����ëè");
        Cat fanfan = new Cat("����", 3, "�л���԰è");
        // ������è�������HashSet��
        Set<Cat> set = new HashSet<Cat>();
        set.add(huahua);
        set.add(fanfan);
        // ��ʾ����è��Ϣ
        Iterator<Cat> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // �����һ���뻨������һ����è
        Cat huahua01 = new Cat("����", 12, "Ӣ����ëè");
        set.add(huahua01);
        System.out.println("**********************************");
        System.out.println("����ظ����ݺ�ĳ���è��Ϣ��");
        it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("**********************************");
        // ���²���һ���³���è
        Cat huahua02 = new Cat("��������", 2, "Ӣ����ëè");
        set.add(huahua02);
        System.out.println("��ӻ���������ĳ���è��Ϣ��");
        it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("**********************************");
        // �ڼ����в��һ�������Ϣ�����
        if (set.contains(huahua)) {
            System.out.println("�����ҵ��ˣ�");
            System.out.println(huahua);
        } else {
            System.out.println("����û�ҵ���");
        }
        // �ڼ�����ʹ�����ֲ��һ�������Ϣ
        System.out.println("**********************************");
        System.out.println("ͨ�����ֲ��һ�����Ϣ");
        boolean flag = false;
        Cat c = null;
        it = set.iterator();
        while (it.hasNext()) {
            c = it.next();
            if (c.getName().equals("����")) {
                flag = true;// �ҵ���
                break;
            }
        }
        if (flag) {
            System.out.println("�����ҵ���");
            System.out.println(c);
        } else {
            System.out.println("����û�ҵ�");
        }

        // ɾ��������������Ϣ���������
        for (Cat cat : set) {
            if ("��������".equals(cat.getName())) {
                set.remove(cat);
                break;
            }
        }
        System.out.println("**********************************");

        System.out.println("ɾ�����������������");
        for(Cat cat:set){
            System.out.println(cat);
        }
        //ɾ�������е����г���è��Ϣ
        System.out.println("**********************************");
        boolean flag1=set.removeAll(set);
        if(set.isEmpty()){
            System.out.println("è�������ˡ�����");
        }else{
            System.out.println("è���ڡ�����");
        }

        if (flag1){
            System.out.println("ɾ���ɹ�");
        }
    }
}
