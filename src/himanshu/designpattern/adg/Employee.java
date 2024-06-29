package himanshu.designpattern.adg;

import java.io.Serializable;

public class Employee implements Serializable, Cloneable {

    private static Employee employee;
    private int id;
    private String name;

    private Employee(){

    }

    public static Employee getInstance(){
        synchronized (Employee.class) {
            if (employee == null) {
                employee = new Employee();
            }
        }
        return employee;
    }

    protected Object readResolve(){
        return employee;
    }

    public Object clone() throws CloneNotSupportedException {
        return employee;
    }
}
