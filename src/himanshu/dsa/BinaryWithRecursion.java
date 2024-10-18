public class BinaryWithRecursion {
    public static void main(String[] args) {
        int[] arr={3,5,10,15,30,50};
        System.out.println(binarySearch(arr,3,0,arr.length-1));
    }

    static int binarySearch(int[] arr,int target, int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(target==arr[mid]){
            return mid;
        }
        if(target<arr[mid]){
            binarySearch(arr, target, s, mid-1);
        }
        return binarySearch(arr, target, mid+1, e);

    }
}
