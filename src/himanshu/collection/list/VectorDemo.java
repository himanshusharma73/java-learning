package himanshu.collection.list;

import java.nio.channels.OverlappingFileLockException;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.addElement(4);
        vector.add(6);
        System.out.println(vector);
        System.out.println(vector.capacity());
        for(int i=0;i<10;i++){
            vector.add(i);
        }
        System.out.println(vector.capacity());
    }
}
