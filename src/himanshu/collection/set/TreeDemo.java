package himanshu.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<Integer>(new MyComparator());
        set.add(10);
        set.add(20);
        set.add(5);
        set.add(3);
        set.add(14);
        set.add(14);
        System.out.println(set);
    }
}

class MyComparator1 implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1=(Integer) o1;
        Integer i2=(Integer)o2;
        //return -i1.compareTo(i2); // for descending order
        //return i2.compareTo(i1); // for descending order
        //return i1.compareTo(i2); for ascending order
        //return -i2.compareTo(i1); // for ascending order

        //return +1; //insertion order
        //return -1;  //reverse insertion order
        return 0; // only add first element
    }
}
