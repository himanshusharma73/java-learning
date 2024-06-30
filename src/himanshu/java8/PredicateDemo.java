package himanshu.java8;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> predicate = str -> str.length()==4;

        Predicate<Integer> isPrimeNumber = number -> {
            if(number<=1){
                return false;
            }
            for (int i= 2;i<=number/2;i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        };


        boolean hima = predicate.test("hima");
        System.out.println(hima);


        System.out.println(isPrimeNumber.test(11));
    }
}
