package himanshu.interviewproblem;
//
public class ReverseStringDemo {
//    public static StringBuilder reverseString(String str){
//        StringBuilder reversedString =new StringBuilder();
//        for (int i=str.length()-1;i>=0;i--){
//            reversedString.append(str.charAt(i));
//        }
//        return reversedString;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(reverseString("anuj"));
//    }



       public static void main(String[] args) {
        System.out.println(reverse("anuj is a java Developer"));
   }

    public static String reverse(String s){
        String str ="";
        for (int i = 0; i <= s.length()-1; i++) {
            char letter = s.charAt(i);
            str = letter+str;


        }
        return str;
    }

}


