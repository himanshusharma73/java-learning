package himanshu.dsa;

public class CealingArray {
    public static void main(String[] args) {
      int [] arr={2,4,6,10,15,20,24,29,30};
      int target=1;
      int ans= cealing(arr, target);
      System.out.println(ans);

    }
    static int cealing(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            if(target>arr[end]){
                return -1;
            }
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
           else{
            return arr[mid];
           }
        }
        return arr[start];
    }
}