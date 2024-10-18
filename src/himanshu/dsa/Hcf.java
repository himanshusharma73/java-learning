package himanshu.dsa;

public class Hcf {
    public static void main(String[] args) {
        System.out.println(hcf(4, 8));
    }

    static int hcf(int a,int b){
        if(a==0){
            return b;
        }
        return hcf(b%a,a);
    }
}
