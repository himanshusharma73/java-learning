package himanshu.designpattern.adg;

import java.io.*;

public class Main1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
        /*Employee employee = Employee.getInstance();
        Employee employee1 = Employee.getInstance();

        System.out.println(employee);
        System.out.println(employee1);*/
        /*Runnable runnable= () -> {
            for (int i=0;i<=100;i++){
                System.out.println(Employee.getInstance());
            }
        };

        Thread thread= new Thread(runnable);
        Thread thread1= new Thread(runnable);
        thread.start();
        thread1.start();
*/

       /* ObjectOutput objectOutputStream=new ObjectOutputStream(new FileOutputStream("file.txt"));
        Employee instance = Employee.getInstance();
        objectOutputStream.writeObject(instance);
        System.out.println(instance);
        ObjectInput objectInputStream= new ObjectInputStream(new FileInputStream("file.txt"));
        System.out.println(objectInputStream.readObject());*/

        Employee employee = Employee.getInstance();
        System.out.println("Without Cloneable" + employee);

        Employee clone = (Employee) employee.clone();
        System.out.println("With clone"+clone);

    }

}
