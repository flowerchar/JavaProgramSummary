package AnimalProj.test;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
//        B b = new B(2);
//        int[] nums = {0,1,2,3,4};
//        do {
//            System.out.println(Arrays.toString(nums));
//            for (int i = 0; i < nums.length; i++) {
//                nums[i] = (++nums[i])%nums.length;
//            }
//        }while (nums[0]!=0);
//        System.out.println(Arrays.toString(nums));
        final int a;
        a = 1;
//        a = 2;
    }
}
class A{
    A(){
        System.out.println("AAA");
    }
}
class B extends A{
    B(){
        System.out.println("BBB");
    }
    B(int a){
        this();
        System.out.println("BBBBBBAAA");
    }
}
class C{}