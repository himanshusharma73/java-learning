package himanshu.Ktech;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class OptionalDemo {
    public static void main(String[] args) {
        String[] str=new String[5];
        str[2]="i am himanshu sharma";

        /*Optional<String> emptyOptional=Optional.empty();
        System.out.println(emptyOptional);

        Optional<String> value=Optional.ofNullable(str[3]);
        System.out.println(value);*/

        List<Integer> list  = List.of();

        Set<Integer> set = Optional.of(list).orElse(null).stream().collect(Collectors.toSet());
        System.out.println(set);
    }

    private int r(){
        return 1;
    }
}

