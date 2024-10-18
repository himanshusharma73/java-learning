public class Reverseno {
    public static void main(String[] args) {
        // reverse(1408);
        // System.out.println(reverse);
        System.out.println(reverse(8021, 1000));
    }
     static int reverse=0;
    static void reverse(int n){
        
        if(n==0){
            return;
        }
        int rem=n%10;
        reverse=reverse*10+rem;
        reverse(n/10);
    }
    static int reverse(int n,int a){
        
        if(n==0){
            return 0;
        }
        return n%10*a+reverse(n/10,a/10);
    }
}
