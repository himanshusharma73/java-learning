package himanshu.Ktech;

import java.util.Arrays;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr={1,2,5,4,7,8,5,1,3,6,9,8,5,1};
        int n=4;
        int[] sortedArray = Arrays.stream(arr).distinct().sorted().toArray();
        System.out.println(Arrays.toString(sortedArray));

       if(sortedArray.length<n){
           System.out.println("No third largest no in list");
       }else System.out.println(sortedArray[sortedArray.length-n]);
    }
}
