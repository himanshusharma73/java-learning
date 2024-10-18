package himanshu.interviewproblem;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateUsingStream {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,4,5,8,2,5,1,2);

        List<Integer> collect = list.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting()))
                .entrySet().stream().filter(value -> value.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect);
    }
}
