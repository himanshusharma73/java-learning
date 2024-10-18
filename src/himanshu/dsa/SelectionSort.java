import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1,4,3,2,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int smallest=i;
            for (int j =i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
    }
}
