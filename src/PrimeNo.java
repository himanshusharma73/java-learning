import java.util.ArrayList;
import java.util.List;

public class PrimeNo {


    public static void main(String[] args) {
        int n=20;
        for(int i=2;i<=n;i++){
            boolean prime=true;
            for (int j = 2; j <i/2 ; j++) {
                if(i%j==0) {
                    prime=false;
                    break;
                }
            }
            if(prime){
                System.out.println(i);
            }
        }
    }

}
