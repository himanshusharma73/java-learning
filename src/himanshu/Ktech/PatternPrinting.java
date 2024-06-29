package himanshu.Ktech;

public class PatternPrinting {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i<= n; i++){
            for (int j = i; j<= n -1; j++) {
                System.out.print(" ");
            }
            System.out.print(i);
            if (i== n){
                for (int j = 1; j < n *2-1; j++) {
                    System.out.print(n);
                }
            }
            else {
                for (int j = 1; j < i * 2 - 2; j++) {
                    System.out.print(" ");
                }
                if (i > 1 ) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }

    }
}
