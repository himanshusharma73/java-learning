package himanshu.dsa;

public class ArrayRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,5,8,7,9};
        System.out.println(arrayRecursion(arr, 0));
    }
    static boolean arrayRecursion(int[] arr ,int i){
      if(i==arr.length-1){
        return true;
      }

      return arr[i]<arr[i+1] && arrayRecursion(arr, i+1);
    }
}
