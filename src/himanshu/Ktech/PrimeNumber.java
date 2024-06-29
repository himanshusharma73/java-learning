package himanshu.Ktech;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }

    public static boolean isPrime(int number){
        boolean noIsPrime=true;
        for (int i=2;i<=number/2;i++){
            if (number%i==0) {
                noIsPrime = false;
                break;
            }
        }
        return noIsPrime;
    }
}
