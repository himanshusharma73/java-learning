package himanshu.interviewproblem;

public class Palindrome {
    public static void main(String[] args) {
        String string = "Nitinn";
        System.out.println(isPalindromeString(string));
    }

    public static boolean isPalindromeString(String palindrome) {
        palindrome = palindrome.toLowerCase();
        for (int i=0; i<palindrome.length(); i++) {
            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
