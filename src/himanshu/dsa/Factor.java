package himanshu.dsa;

import java.util.ArrayList;

public class Factor{
    public static void main(String[] args) {
        fact(20);
    }

    static void fact(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i <=Math.sqrt(n); i++) {
            if(n%i==0){
                System.out.print(i+" ");
                list.add(n/i);
            }
        }
        for (int i =list.size()-1;i>0;i--) {
           // System.out.println(list.g);
        }
    }

}