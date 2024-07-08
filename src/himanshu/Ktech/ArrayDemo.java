package himanshu.Ktech;

import lombok.Data;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(2);
        employee.setName("himanshu");


        // we can store heterogeneous object in Object array;

        Object[] obj = new Object[6];
        obj[0] = 1;
        obj[2] = "str";
        obj[3] = false;
        obj[4] = 2.2;
        obj[5] = employee;
        System.out.println(Arrays.toString(obj));

        System.out.println(100+100+"string");
    }

}

@Data
class Employee {
    private int id;
    private String name;
}