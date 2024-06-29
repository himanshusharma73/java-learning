package himanshu.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetString {
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<>(new Mycomparator2());
        set.add("Himanshu sharma");
        set.add("Vinay sharma");
        set.add("Sudhir sharma");
        set.add("Ravi sharma");
        set.add("Vishnu sharma");
        set.add("Ashutosh sharma");
        System.out.println(set);
    }
}

class  Mycomparator2 implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1=o1.toString();
        String s2=o2.toString();
        //return -s1.compareTo(s2);
        //return s1.compareTo(s2);
        //return -s2.compareTo(s1);
        return s2.compareTo(s1);
    }
}
