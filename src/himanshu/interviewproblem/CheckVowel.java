package himanshu.interviewproblem;

public class CheckVowel {
    public static void main(String[] args) {
        String input = "Hello";
        System.out.println(checkVowel(input));
    }
    public static boolean checkVowel(String input){
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
