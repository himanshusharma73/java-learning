package himanshu.interviewproblem;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static void main(String[] args) {
        int start = 900;
        int end = 1000;

        List<Integer> primeNumber = new ArrayList<>();

        for (int i = start; i<=end; i++){
           if (isPrime(i)){
               primeNumber.add(i);
           }
        }

        System.out.println(primeNumber);
    }


    public static boolean isPrime(int number){
        if (number <= 1) {
            return false;
        }
        for (int i=2; i<number; i++){
            if (number % i ==0){
              return false;
            }
        }
        return true;
    }
}
