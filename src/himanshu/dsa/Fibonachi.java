package himanshu.dsa;

public class Fibonachi {
    public static void main(String[] args) {
        // System.out.println(0);
        // System.out.println(1);
        // fibonachi(0, 1,21);
        System.out.println(fabo(50));
    }

    static void fibonachi(int a,int b,int n){
        int c=a+b;
        if(c>n){
            return;
        }
        
        System.out.println(c);
        fibonachi(b, c,n);
    }

    static int fabo(int n){
        if(n<2){
            return n;
        }
        return fabo(n-1) + fabo(n-2);
    }
}
