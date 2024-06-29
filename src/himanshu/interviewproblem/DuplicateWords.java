package himanshu.interviewproblem;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateWords {
    public static void main(String[] args) {
        String str="i am a java developer i am a software developer";
        Map<String,Integer> map=new LinkedHashMap<>();

        String[] strings=str.split(" ");
        for (String word : strings) {
            if (map.containsKey(word)) {
                Integer count = map.get(word);
                count++;
                map.put(word, count);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map);
    }
}
