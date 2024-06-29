package himanshu.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=i;
        }

        Arrays.stream(arr).filter(a -> a % 2 == 0).forEach(System.out::print);
        demo();
    }


    public static void demo(){
        List<Integer> list=new ArrayList<>();
        list.add(5,10);
        System.out.println(list);

    }
}
