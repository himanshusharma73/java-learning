package himanshu.interviewproblem;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String str="I am a java developer i am a software developer";
        Map<Character,Integer> map=new LinkedHashMap<>();
        String[] strings=str.split(" ");

        for (int index=0;index<str.length();index++){
            Character ch=str.charAt(index);
            if (map.containsKey(ch)){
                Integer count=map.get(ch);
                count++;
                map.put(ch,count);
            }
            else {
                map.put(ch,1);
            }
        }
        System.out.println(map);

    }
}
