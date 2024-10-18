public class PeakMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,4,3,2};
        int ans=peak(arr);
        System.out.println(ans);
    }
    static int peak(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){  //then you are in decending array and we have to check in the left side with mid
                end=mid;
            }
            else if(arr[mid]<arr[mid+1]){// you are in accending order and we to check in reight side withoud taken mid because we know that mid is<mid+1
                start=mid+1;
            }
            
        }
        return arr[start];
    }
}
