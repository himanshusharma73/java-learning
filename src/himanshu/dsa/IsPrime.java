public class IsPrime {
    public static void main(String[] args) {
        int n=40;
        boolean[] arr=new boolean[n+1];
        isPrime(n, arr);
    }

    static void isPrime(int n,boolean[] primes){
        for (int i = 2; i*i < n; i++) {
            if(!primes[i]){
                for (int j = i*2; j <=n; j+=i) {
                    primes[j]=true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
}
