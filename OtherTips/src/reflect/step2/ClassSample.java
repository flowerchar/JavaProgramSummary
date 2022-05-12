package reflect.step2;

import reflect.step2.entity.Employee;

public class ClassSample {
    public static void main(String[] args) {
        try {
            //Class.forName()方法将指定的类加载到jvm,并返回对应Class对象
            Class employeeClass = Class.forName("reflect.step2.entity.Employee");
            System.out.println("Employee已被加载到jvm");
            //newInstance通过默认构造方法创建新的对象
            Employee emp = (Employee)employeeClass.newInstance();
            System.out.println(emp);
        } catch (ClassNotFoundException e) {
            //类名与类路径书写错误是抛出"类无法找到"异常
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            //非法访问异常,当在作用域外访问对象方法或成员变量时抛出
            e.printStackTrace();
        } catch (InstantiationException e) {
            //对象无法被实例化,抛出"实例化异常"
            e.printStackTrace();
        }
    }
}
