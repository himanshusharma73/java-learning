package himanshu.interviewproblem;

public class Example {
    public static void main(String[] args) {
        try {
            // Throw an instance of Error
            throw new Error("This is an example error");
        } catch (Error e) {
            // Handle the error
            System.out.println("Caught an Error: " + e.getMessage());

        }
    }

}
