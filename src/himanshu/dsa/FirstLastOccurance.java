package himanshu.dsa;

public class FirstLastOccurance {
    public static void main(String[] args) {
        int[] arr={2,4,7,7,7,7,8,10,15,20};
        int target=7;
        
    searchRange(arr, target);
        
       
    }
    static int[] searchRange(int[] arr,int target){
        int[] occurance={-1,-1};
        occurance[0]=firstOccurance(arr, target);
        occurance[1]=LastOccurance(arr, target);
        return occurance;
    }
    static int firstOccurance(int[] arr,int target){
        int occurance=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                occurance=mid;  // may be the answer 
                end=mid-1;
            }
            
        }
            return occurance;
        
    }
    static int LastOccurance(int[] arr,int target){
        int occurance=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                occurance=mid;  // may be the answer 
                start=mid+1;
            }
            
        }
            return occurance;
        
    }
}
