package reflect.step2;

import reflect.step2.entity.Employee;

public class ClassSample {
    public static void main(String[] args) {
        try {
            //Class.forName()������ָ��������ص�jvm,�����ض�ӦClass����
            Class employeeClass = Class.forName("reflect.step2.entity.Employee");
            System.out.println("Employee�ѱ����ص�jvm");
            //newInstanceͨ��Ĭ�Ϲ��췽�������µĶ���
            Employee emp = (Employee)employeeClass.newInstance();
            System.out.println(emp);
        } catch (ClassNotFoundException e) {
            //��������·����д�������׳�"���޷��ҵ�"�쳣
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            //�Ƿ������쳣,��������������ʶ��󷽷����Ա����ʱ�׳�
            e.printStackTrace();
        } catch (InstantiationException e) {
            //�����޷���ʵ����,�׳�"ʵ�����쳣"
            e.printStackTrace();
        }
    }
}
