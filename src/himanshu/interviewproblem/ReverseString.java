package himanshu.interviewproblem;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str="i love coding";

        String[] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));
        StringBuilder builder=new StringBuilder();

        for (int i=arr.length-1;i>=0;i--){
            builder.append(arr[i]).append(".");
        }
        System.out.println(builder);
    }
}
