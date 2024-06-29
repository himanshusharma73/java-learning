package himanshu.collection;


import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionMethods {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.remove(Integer.valueOf(20)));
        System.out.println(list);
//        list.clear();
//        System.out.println(list);
        System.out.println(list.contains(30));
        //int[] arr=list.toArray();
    }

}