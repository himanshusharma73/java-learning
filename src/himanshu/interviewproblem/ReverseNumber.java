package himanshu.interviewproblem;

public class ReverseNumber {
    public static void main(String[] args) {

        int number=117554;
        int reversedNumber=0;
        while (number!=0){
            reversedNumber=reversedNumber*10+number%10;
            number=number/10;
        }
        System.out.println(reversedNumber);
    }


}
