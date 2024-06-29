package himanshu.collection.cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for (int i=4;i<=15;i++){
            list.add(i);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if (next % 2==0){
                iterator.remove();

            }
            else {
                System.out.println(next);
            }
        }
    }
}
