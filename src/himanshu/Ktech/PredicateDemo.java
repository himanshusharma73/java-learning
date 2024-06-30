package himanshu.Ktech;

import java.beans.Introspector;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> p = value -> value% 2==0;
        Predicate<Integer> p2= value -> value%3==0;

        List<Integer> list = List.of(2,5,7,8,9,3,1,0,25,15,10,30);
        System.out.println(p.test(21));
        //System.out.println(list.stream().filter(p.and(p2)).collect(Collectors.toList()));
    }
}
