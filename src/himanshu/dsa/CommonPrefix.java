package himanshu.dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
        
     static String longestCommonPrefix(String[] strs) {
        StringBuilder result=new StringBuilder();
        Arrays.sort(strs);
        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();
        for (int i = 0; i<first.length; i++) {
            if(first[i]==last[i]){
                result.append(first[i]);
            }
            else{
                break;
            }
        }
        return result.toString();
    }
}
