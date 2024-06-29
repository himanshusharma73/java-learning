package himanshu.interviewproblem;

import java.util.Arrays;

public class StringFirstCapital {
    public static void main(String[] args) {
        String str="i love coding";
        Arrays.asList(str.split(" "))
                . stream()
                .map(a->a.replace(a.substring(0,1),a.substring(0,1).toUpperCase())+" ")
                .forEach(System.out::print);



        System.out.print("\n======================\n");


        String[] arr=str.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <arr.length ; i++) {
            builder.append(capital(arr[i]));
            builder.append(" ");
        }
        System.out.println(builder);
    }

    static StringBuilder capital(String str){
        StringBuilder builder=new StringBuilder();
        char ch=str.charAt(0);
        ch = Character.toUpperCase(ch);
        builder.append(ch).append(str.substring(1).trim());
        return builder;
    }
}
