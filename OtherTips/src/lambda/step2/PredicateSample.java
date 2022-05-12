package lambda.step2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 理解函数式编程
 * Predicate函数式接口的使用方法
 */
public class PredicateSample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = n->n<4;
        boolean result = predicate.test(10);
        System.out.println(result);
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        /*for(Integer num:list){
            if(num%2==1){
                System.out.println(num);
            }
        }*/

        filter(list,n->n%2==1); //取所有奇数
        filter(list,n->n%2==0); //取所有偶数
        filter(list,n->n>5 && n%2==0); //取所有大于5的偶数
    }
    public static void filter(List<Integer> list , Predicate<Integer> predicate){
        for(Integer num:list){
            if(predicate.test(num)){
                System.out.print(num + " ");
            }
        }
        System.out.println("");
    }
}
