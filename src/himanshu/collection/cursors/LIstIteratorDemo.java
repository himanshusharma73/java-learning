package himanshu.collection.cursors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LIstIteratorDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for (int i=4;i<=15;i++){
            list.add(i);
        }

        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
