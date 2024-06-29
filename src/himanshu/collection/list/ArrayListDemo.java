package himanshu.collection.list;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList linkedList = new LinkedList();
        System.out.println(list instanceof Serializable);
        System.out.println(linkedList instanceof Cloneable);
        System.out.println(list instanceof RandomAccess);
        System.out.println(linkedList instanceof RandomAccess);
    }

}
