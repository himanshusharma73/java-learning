package himanshu.Ktech;

public class Fibonacci {
    public static void main(String[] args) {
        printFibonacciUsingRecursion(1,1,15);
    }

    public static void printFibonacci(int no){
        int first=1;
        int second=1;
        while (no>second) {
            System.out.println(first);
            System.out.println(second);
            first = second + first;
            second = first + second;
        }
    }

    public static void printFibonacciUsingRecursion(int first, int second, int number) {
        if (first <= number) {
            System.out.println(first);
            printFibonacciUsingRecursion(second, first + second, number);
        }
    }
}
