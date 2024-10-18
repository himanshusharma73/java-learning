package himanshu.dsa;

public class FirstOccurance {
    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

    static int strStr(String haystack, String needle) {
        int result=-1;
        int i=0;
        while(i<needle.length() ) {
            if(haystack.charAt(i)==needle.charAt(i)){
                result=i;
                i++;
            }
        }
        return result;
    }
}
