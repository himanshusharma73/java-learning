package himanshu.interviewproblem;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWords {

    public static void main(String[] args) {
        List<String> list = List.of("anuj","anuj","himanshu","himanshu","amit","sumit");
        String str = "hello i am learning java spring and spring boot";
        Map<Character, Long> charFrequency = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting()));
        System.out.println(collect);
        System.out.println(charFrequency);
    }

}
