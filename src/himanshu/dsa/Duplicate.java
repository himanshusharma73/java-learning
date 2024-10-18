package himanshu.dsa;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,5,3,1};
        System.out.println(duplicate(arr));
    }

    static int duplicate(int[] arr){
       
        int i=0;
        while (i<arr.length) {
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
        int ans=0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                ans=arr[j];
            }
        }
        return ans;
    }
}
