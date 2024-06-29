package himanshu.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> t=new TreeSet<>(new MyComparator());
        //t.add(null);  //.NullPointerException: Cannot invoke "java.lang.Comparable.compareTo(java.lang.Object)" because "k1" is null
        t.add(3);
        t.add(4);
        t.add(9);
        t.add(1);
        t.add(0);
        //t.add("A"); // Exception in thread "main" java.lang.ClassCastException: java.lang.Integer incompatible with java.lang.String
        // at java.base/java.lang.String.compareTo(String.java:148)

        // only homogeneous object are allowed

        System.out.println(t.add(0));
        //t.add(null);

        System.out.println(t);
    }
}

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        //return 0; only first element will be inserted
        // return +1; // elements will be inserted acc to insertion order even duplicate will be inserted
        // return -1; // elements will be inserted acc to reversed insertion order even duplicate will be inserted7
        return -o1.compareTo(o2);
    }
}
