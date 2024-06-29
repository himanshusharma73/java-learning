package himanshu.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(50);
        set.add(30);
        set.add(40);
        set.add(null);
        System.out.println(set.add(50));
        System.out.println(set);
    }
}
