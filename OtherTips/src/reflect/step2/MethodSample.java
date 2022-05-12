package reflect.step2;

import reflect.step2.entity.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ����Method���������
 */
public class MethodSample {
    public static void main(String[] args) {
        try {
            Class employeeClass = Class.forName("reflect.step2.entity.Employee");
            Constructor constructor = employeeClass.getConstructor(new Class[]{
                    Integer.class,String.class,Float.class,String.class
            });
            Employee employee = (Employee)constructor.newInstance(new Object[]{
                    100,"����",3000f,"�з���"
            });
            Method updateSalaryMethod = employeeClass.getMethod("updateSalary" , new Class[]{
                    Float.class
            });
            Employee employee1 = (Employee)updateSalaryMethod.invoke(employee,new Object[]{1000f});
            System.out.println(employee1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
