package himanshu.Ktech;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,8,10,15,20};
        System.out.println(binarySearch(arr,5));
    }

    public static int binarySearch(int[] arr,int number){
        int start=0;

        int end=arr.length-1;
        while (start<=end){
            int middle = start + (end - start) / 2;
            if(arr[middle]==number){
                return middle;
            }
            else if (number<arr[middle]){
                end=middle-1;
            }
            else {
                start=middle;
            }
        }
        return -1;
    }
}
