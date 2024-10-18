package himanshu.dsa;

public class AgnosticBinarySearch {
    public static void main(String[] args) {
        //int[] arr={-118,-12,0,2,4,8,10,15,40,55,60};
        int [] arr={60,55,40,15,10,8,4,2,0,-12,-118};
        int target=15;
        int ans=agnosticBS(arr, target);
        System.out.println(ans);
    }

    static int agnosticBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(arr[start]<arr[end]){
                if(target<arr[mid]){
                    end=mid-1;
                }
            else{
                start=mid+1;
            }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
    return -1;
    }
}
