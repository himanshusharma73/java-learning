package himanshu.Ktech;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfVowels {
    public static void main(String[] args) {
        String a="2";
        System.out.println(numberOfVowelsAndConsonants(a));
    }
    public static Map<String,Integer> numberOfVowelsAndConsonants(String s1){
        List<Character> vowels=List.of('a','e','i','o','u');

        Map<String,Integer> map=new HashMap<>();
        map.put("vowels",0);
        map.put("consonants",0);

        s1=s1.replaceAll(" ","");

        s1.chars().mapToObj(c -> (char) c).forEach(ch -> {
            if (vowels.contains(ch)){
                Integer number=map.get("vowels");
                map.put("vowels",number+1);
            }
            else {
                Integer number = map.get("consonants");
                map.put("consonants", number + 1);
            }
        });
        return map;
    }
}
