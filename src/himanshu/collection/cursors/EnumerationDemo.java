package himanshu.collection.cursors;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        for (int i=4;i<=15;i++){
            vector.add(i);
        }

        Enumeration<Integer> elements = vector.elements();
        while (elements.hasMoreElements()){
            Integer i = elements.nextElement();
            System.out.println(i);
        }
    }
}
