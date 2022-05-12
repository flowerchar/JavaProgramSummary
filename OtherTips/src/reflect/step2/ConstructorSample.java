package reflect.step2;

import reflect.step2.entity.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * ���ô��ι��췽����������
 */
public class ConstructorSample {
    public static void main(String[] args) {
        try {
            Class employeeClass = Class.forName("reflect.step2.entity.Employee");
            Constructor constructor = employeeClass.getConstructor(new Class[]{
                    Integer.class,String.class,Float.class,String.class
            });
            Employee employee = (Employee) constructor.newInstance(new Object[]{
                    100,"����",3000f,"�з���"
            });
            System.out.println(employee);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            //û���ҵ���֮��Ӧ��ʽ�ķ���
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            //�������õķ������ڲ��׳����쳣��û�б�����ʱ
            e.printStackTrace();
        }
    }
}
