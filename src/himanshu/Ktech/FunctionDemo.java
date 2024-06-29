package himanshu.Ktech;

import javax.naming.InsufficientResourcesException;
import javax.swing.*;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> f= i -> i*i;

        Function<Integer, Integer> f2= i -> i+i;

        System.out.println(f.compose(f2).apply(2));
        System.out.println(f2.andThen(f).apply(3));
    }
}
