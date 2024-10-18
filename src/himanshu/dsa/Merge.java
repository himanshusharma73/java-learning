import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] num1={1,2,3,4,0,0,0};
        int [] num2={1,5,8};
        int m=4;
        int n=3;
        merge(num1, m, num2, n);
        System.out.println(Arrays.toString(num1));

    }
    static void merge (int[] num1,int m,int[] num2,int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(i>=0 && j>=0){
            if(num1[i]>num2[j]){
                num1[k]=num1[i];
                i--;

            
                k--;
            }
            else{
                num1[k]=num2[j];
                j--;
                k--;
            }
        }
        while(i>=0){
            num1[k--]=num1[i--];
        }
        while(j>=0){
            num1[k--]=num2[j--];
        }
       
    }
}
