package himanshu.dsa;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(countZero(2010200, 0));
    }

    static int countZero(int n,int a){
        if(n==0){
            return a;
        }
        else if(n%10==0){
            return countZero(n/10, a+1);
        }
        return countZero(n/10, a);
    }
}
