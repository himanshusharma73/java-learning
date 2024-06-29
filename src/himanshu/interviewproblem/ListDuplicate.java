package himanshu.interviewproblem;

import java.util.*;
import java.util.stream.Collectors;

public class ListDuplicate {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(30);
        System.out.println("List with duplicate " +list);

        list = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list);



        /*Set<Integer> set=new LinkedHashSet<>();

        for (int i=0;i<list.size();i++){
            set.add(list.get(i));
        }
        System.out.println("Set without duplicate " +set);
        list.clear();

        list = set.stream().collect(Collectors.toList());
        System.out.println(list);*/
    }
}

