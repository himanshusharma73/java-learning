package himanshu.Ktech;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(square(5));
    }

    public static int factorial(int number){
        if(number==0 || number==1){
            return 1;
        }
        return factorial(number-1)*number;
    }

    public static int square(int number){
        return number*number;
    }
}
