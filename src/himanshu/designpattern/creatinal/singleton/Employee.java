package himanshu.designpattern.creatinal.singleton;

import java.io.Serializable;

public class Employee implements Serializable {

    private static Employee employee;
    private int id;
    private int name;

    private Employee(){

    }


        public static Employee getInstance() {
         //   synchronized(Employee.class) {
            if (employee == null) {
                employee = new Employee();
            }
            return employee;
            // }
    }

    protected Object readResolve(){
        return employee;
    }
}
