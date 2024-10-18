package himanshu.dsa;

import java.util.Arrays;

public class ArrayReverse {
     public static void main(String[] args) {
        int[] arr={1,5,18,10,2};
       reverse(arr);
       System.out.println(Arrays.toString(arr));
     // System.out.println(max(arr));
      
     }

    //  static int max(int[] arr){
    //     int max=0;
    //     for(int i=0;i<arr.length;i++){
    //         if(max<arr[i]){
    //             max=arr[i];
    //         }
    //     }
    //     return max;
    //  }

    static void reverse(int[] arr){
        
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    static void swap(int [] arr,int start ,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

}
