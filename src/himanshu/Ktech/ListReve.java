package himanshu.Ktech;

import java.util.ArrayList;
import java.util.List;

public class ListReve {
    public static void main(String[] args) {
        List<Integer> list =List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(listReverse1(list));
    }

    private static List<Integer> listReverse(List<Integer> list) {
        int start=0;
        int middle= list.size()/2;
        int secondStart=middle;

        List<Integer> expectedList=new ArrayList<>();
        while(start<middle){
            expectedList.add(list.get(start));
            expectedList.add(list.get(secondStart));
            start++;
            secondStart++;
        }
        return expectedList;
    }

    private static List<Integer> listReverse1(List<Integer> list) {
        int start=0;
        int middle= list.size()%2==0 ? list.size()/2 :list.size()/2+1;
        int secondStart=middle;

        List<Integer> expectedList=new ArrayList<>();
        while(secondStart<=list.size()-1 && start<middle){
            expectedList.add(list.get(start));
            expectedList.add(list.get(secondStart));
            start++;
            secondStart++;
        }
        return expectedList;
    }
}
