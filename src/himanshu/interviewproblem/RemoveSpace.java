package himanshu.interviewproblem;

public class RemoveSpace {
    public static void main(String[] args) {
        System.out.println(removeSpace("hello  i am himanshu"));
    }

    public static StringBuilder removeSpace(String s){
        StringBuilder output=new StringBuilder();
        char[] ch=s.toCharArray();
        for (int i=0;i<ch.length;i++){
            if (ch[i]!=' '){
                output.append(ch[i]);
            }
        }
        return output;
    }
}
