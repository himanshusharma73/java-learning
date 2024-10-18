public class SearchinginInfinite {
    public static void main(String[] args) {
        int[] arr={2,4,8,10,15,18,20,22,25};
        int target=20;
        int ans=ans(arr, target);
        System.out.println(ans);
    }

    static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;  // temporay start because start is used in end
            end=end+(end-start+1)*2;   // previous end +size of the box
            start=temp;

        }
        return search(arr, target,start,end);

    }
    static int search(int[] arr,int target,int start,int end){
        // int start=0;
        // int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
