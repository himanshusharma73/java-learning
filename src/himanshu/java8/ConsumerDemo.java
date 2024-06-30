package himanshu.java8;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> print = s -> System.out.println(s);

        print.accept("Hello java");

        Consumer<List<String>> saveToDatabase = li -> li.forEach(System.out::println);
        saveToDatabase.accept(List.of("Hi","Hello","java"));
    }


}
