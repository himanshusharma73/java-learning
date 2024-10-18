package himanshu.interviewproblem;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        printFibo(1,1,20);
    }

    public static void printFibo(int firstNumber, int secondNumber, int till) {
        if(firstNumber<=till) {
            System.out.println(firstNumber);

            printFibo(secondNumber, firstNumber + secondNumber, till);
        }
    }
}
