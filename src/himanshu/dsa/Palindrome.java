package himanshu.dsa;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
     public static boolean isPalindrome(int number) {
        int reversedNumber=0;
        int temp=number;
        while(number!=0){
            reversedNumber=reversedNumber*10+number%10;
            number=number/10;
        }
        return temp==reversedNumber;
    }
}
