package himanshu.Ktech;

import java.util.Arrays;

public class ArrayProblem {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(getSolvedProblem(arr)));
    }

    public static int[] getSolvedProblem(int[] arr){
        int start=0;
        int middle= arr.length/2;
        int secondStart= arr.length%2 ==0 ? middle : middle+1;

        int[] reversedArray=new int[arr.length];

        while(secondStart<arr.length){
            reversedArray[start*2]=arr[start];
                reversedArray[start * 2 + 1] = arr[secondStart];
            start++;
            secondStart++;
        }
        if (arr.length % 2 != 0) {
            reversedArray[arr.length - 1] = arr[middle];
        }
        return reversedArray;
    }
}
