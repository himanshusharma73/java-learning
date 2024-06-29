package himanshu.Ktech;

import java.util.Objects;

public class ReverseStringRecursion {
    public static void main(String[] args) {
        String s="Hello it's all about you";
        System.out.println(reverseStringWords(s));
        reverseString(s);
    }

    public static String reverseStringWords(String s){
        if(Objects.equals(s, "")){
            return "";
        }
        return reverseStringWords(s.substring(1))+s.charAt(0);
    }


    public static void reverseString(String s){
        String[] strings = s.split(" ");
        for (int i=strings.length-1;i>=0;i--){
            System.out.print(strings[i]+" ");
        }
    }
}
