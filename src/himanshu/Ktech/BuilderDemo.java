package himanshu.Ktech;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;

@Data
@Builder
public class BuilderDemo {
    private  int id;
    private String name;
    private String address;
    private int mobileNo;
}

class Test2{

    public static void main(String[] args) {
        BuilderDemo builderDemo= BuilderDemo.builder().address("Bhaila").mobileNo(102566).build();
        System.out.println(builderDemo.toString());
    }
}
