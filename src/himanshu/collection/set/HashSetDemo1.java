package himanshu.collection.set;

import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args) {


        HashSet hashSet=new HashSet();
        hashSet.add("b");
        hashSet.add("A");
        hashSet.add("c");
        hashSet.add("d");
        hashSet.add("e");
        hashSet.add(null);
        System.out.println(hashSet.add("b"));
        System.out.println(hashSet);

        /*the initial capacity of hashset is 16;
        and fill ratio is 0.75 i.e after filling 75% of the intial capacity new hashset is created
        constructor of Hashset
        1=same
        2=new HashSet(initial capacity,FR);
        3=new HashSet(intial capacity);
        4=new HashSet(collection);
        */
    }
}
