package reflect.step2;

import reflect.step2.entity.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 利用Field对成员变量赋值/取值
 */
public class FieldSample {
    public static void main(String[] args) {
        try {
            Class employeeClass = Class.forName("reflect.step2.entity.Employee");
            Constructor constructor = employeeClass.getConstructor(new Class[]{
                    Integer.class,String.class,Float.class,String.class
            });
            Employee employee = (Employee) constructor.newInstance(new Object[]{
                    100,"李磊",3000f,"研发部"
            });
            Field enameField = employeeClass.getField("ename");
            enameField.set(employee,"李雷");
            String ename = (String)enameField.get(employee);
            System.out.println("ename:" + ename);
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
        } catch (NoSuchFieldException e) {
            //没有找到对应成员变量时抛出的异常
            e.printStackTrace();
        }
    }
}
