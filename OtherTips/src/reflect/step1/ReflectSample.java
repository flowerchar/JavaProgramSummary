package reflect.step1;

import java.util.Scanner;

/**
 * ��ʶ���������
 */
public class ReflectSample {
    /**
     * ��ͳ�Ĵ�������ʽ
     */
    public static void case1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("�������������:");
        String op = scanner.next();
        System.out.print("������a:");
        int a = scanner.nextInt();
        System.out.print("������b:");
        int b = scanner.nextInt();
        MathOperation mathOperation = null;
        if(op.equals("Addition")){
            mathOperation = new Addition();
        }else if(op.equals("Subtraction")) {
            mathOperation = new Subtraction();
        }else if(op.equals("Multiplication")){
            mathOperation = new Multiplication();
        }else{
            System.out.println("��Ч�ļ�����");
            return;
        }
        float result = mathOperation.operate(a, b);
        System.out.println(result);
    }

    /**
     * ���÷��䴴������������
     */
    public static void case2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("�������������:");
        String op = scanner.next();
        System.out.print("������a:");
        int a = scanner.nextInt();
        System.out.print("������b:");
        int b = scanner.nextInt();
        MathOperation mathOperation = null;
        try {
//            new  Addition()
            mathOperation = (MathOperation) Class.forName("reflect.step1." + op).newInstance();
        }catch(Exception e){
            System.out.println("��Ч�ļ�����");
            return;
        }
//        meta class Ԫ��
        float result = mathOperation.operate(a, b);
        System.out.println(result);
    }



    public static void main(String[] args) {
        ReflectSample.case2();
    }
}
