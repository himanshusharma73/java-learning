package himanshu.dsa;

public class CealingOfChar {
    public static void main(String[] args) {
        char [] arr={'a','c','e','h','k','l'};
        char target='l';
        char ans=cealingChar(arr, target);
        System.out.println(ans);
    }
    static char cealingChar(char [] arr,char target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            if(target>=arr[end]){
                return arr[0];
            }
            int mid=start+(end-start)/2;
            if (target<arr[mid]) {          
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return arr[start];
    }
}
