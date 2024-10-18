package himanshu.interviewproblem;

import java.util.List;
import java.util.stream.Collectors;

public class OddNumber {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,4,5,8,10);

        System.out.println(list.stream().anyMatch(no -> no !=0));
    }
}

