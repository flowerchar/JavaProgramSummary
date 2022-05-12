package reflect.step2;

import reflect.step2.entity.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ��ȡ�������г�Ա����ֵ
 */
public class getDeclaredSample {
    public static void main(String[] args) {
        try {
            Class employeeClass = Class.forName("reflect.step2.entity.Employee");
            Constructor constructor = employeeClass.getConstructor(new Class[]{
                    Integer.class, String.class, Float.class, String.class
            });
            Employee employee = (Employee) constructor.newInstance(new Object[]{
                    100, "����", 3000f, "�з���"
            });
            //��ȡ��ǰ�����г�Ա����
            Field[] fields = employeeClass.getDeclaredFields();
            for(Field field : fields){
//                System.out.println(field.getName());
                if(field.getModifiers() == 1){ //pubilc����
                    Object val = field.get(employee);
                    System.out.println(field.getName() + ":" + val);
                }else if(field.getModifiers() == 2){ //private����
                    String methodName = "get" + field.getName().substring(0,1).toUpperCase()
                                        + field.getName().substring(1);
                    Method getMethod = employeeClass.getMethod(methodName);
                    Object ret = getMethod.invoke(employee);
                    System.out.println(field.getName() + ":" + ret);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
