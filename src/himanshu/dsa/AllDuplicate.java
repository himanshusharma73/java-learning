package himanshu.dsa;

import java.util.Arrays;

public class AllDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        System.out.println(Arrays.toString(allDuplicate(arr)));
    }
    static int[] allDuplicate(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
        int[] ans={-1,-1};
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                ans[0]=arr[j];
                ans[1]=j+1;
            }
        }
        return ans;
    }
}
