package himanshu.dsa;

public class FloorOfNumber {
    public static void main(String[] args) {
        int [] arr={4,5,8,10,18,20,24,30,35};
        int target=21;
        int ans = floorOfNumber(arr, target);
        System.out.println(ans);
    }

    static int floorOfNumber(int [] arr,int target){
        int start=0,end=arr.length-1;
        while (start<=end) {
            if(target<arr[start]){
                return -1;
            }
            int mid=start+(end-start)/2;
            if (target<arr[mid]) {
                end=mid-1;
            }
            else if (target>arr[mid]) {
                start=mid+1;
            }
            else{
                return arr[mid];
            }
            
        }
        return arr[end];
    }
}
