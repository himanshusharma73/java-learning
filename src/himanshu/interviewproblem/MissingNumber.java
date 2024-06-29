package himanshu.interviewproblem;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7};
        System.out.println(findMissingNumber(arr));
    }

    public static int findMissingNumber(int[] arr){
        for (int i=0;i< arr.length;i++){
            if (arr[i]!=i){
                return i;
            }
        }
        return -1;
    }
}
