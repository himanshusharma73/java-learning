package himanshu.java8;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,String> subString = str ->
            str.substring(0,3);

        Function<String,String> toUppercase = String::toUpperCase;

        Function<Integer, Integer> doubleNum = num -> num*2;
        Function<Integer,Integer> cube = num->num*num*num;


        System.out.println(subString.apply("HeyIamJavaDeveloper"));
        System.out.println(toUppercase.apply("hello"));

        System.out.println(doubleNum.andThen(cube).apply(2));
        System.out.println(cube.andThen(doubleNum).apply(2));
        System.out.println(doubleNum.compose(cube).apply(2));
    }
}
