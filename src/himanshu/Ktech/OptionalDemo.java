package himanshu.Ktech;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String[] str=new String[5];
        str[2]="i am himanshu sharma";

        Optional<String> emptyOptional=Optional.empty();
        System.out.println(emptyOptional);

        Optional<String> value=Optional.ofNullable(str[3]);
        System.out.println(value);
    }
}
