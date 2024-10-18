package himanshu.dsa;

public class EvenDigitinArray {
    public static void main(String[] args) {
        int[] arr={40,505,4105,1,516660,54895214};
        System.out.println(findNumber(arr));
    }
    static int findNumber(int[] arr){
        int count=0;
      
        for(int num:arr){
           
            if(isEven(num)){
                count++;
            }
        }
        return count;
    }
    static boolean isEven(int num){
        int digit=even(num);
            if(digit%2==0){

                return true;
            }
        
        return false;
        
    }
    static int even(int num) {
        int countno=0;
        while(num>0){
            countno++;
            num=num/10;
        }
        return countno;
    }
}
