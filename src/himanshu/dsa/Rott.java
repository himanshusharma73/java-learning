public class Rott {
    public static void main(String[] args) {
        int[] arr = {9, 10, 12, 1, 2, 4, 8};
        System.out.println(find(arr, 9));
    }

    static int binary(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int find(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid] && target >= arr[start]) {
                return binary(arr, target, start, mid - 1);
            } else if (target > arr[mid] && target <= arr[end]) {
                return binary(arr, target, mid + 1, end);
             } 
             else if (arr[start] > arr[mid]) {
                 end = mid - 1;
             } else {
                 start = mid + 1;
             }
        }
        return -1;
    }
}
