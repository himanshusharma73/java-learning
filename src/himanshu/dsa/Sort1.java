import java.util.Arrays;

public class Sort1 {
    public static void main(String[] args) {
        int[] arr={5,4,3,1,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Bubble sort
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    //Selectioon sort
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int smallest=arr[i];
            for (int j = i; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    smallest=j+1;
                }
            }
           int temp=arr[smallest];
           arr[smallest]=arr[i];
           arr[i]=temp;
        }
    }

    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;                }
            }
        }
    }
}
