package himanshu.java8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiDemo {
    public static void main(String[] args) {

        BiPredicate<String,Integer> checkLength = (str,len) -> str.length()==len;

        BiFunction<Integer,Integer,Integer> sum = (num1,num2) -> num1+num2;

        BiConsumer<String,String> joinString = (str1,str2) -> System.out.println(str1+str2);

        System.out.println(checkLength.test("hello",5));

        System.out.println(sum.apply(2,5));

        joinString.accept("hello"," world");


    }
}
