package himanshu.Ktech;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String s1="debit card";
        String s2="bad credit";
        System.out.println(isAnagramString(s1,s2));
    }

    public static boolean isAnagramString(String s1,String s2){
        char[] ch=s1.replace(" ", "").toLowerCase().toCharArray();
        Arrays.sort(ch);
        char[] ch2=s2.replace(" ", "").toLowerCase().toCharArray();
        Arrays.sort(ch2);

        return Arrays.equals(ch, ch2);

    }
}
