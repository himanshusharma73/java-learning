package himanshu.interviewproblem;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1,5,7,8,9,2,6};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr){
        for (int i =0; i<arr.length;i++){
            int minimum=i;
            for (int j=i+1;j<arr.length;j++){


                if(arr[j]<arr[minimum]){
                    minimum=j;
                }
            }
            int temp=arr[minimum];
            arr[minimum]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
