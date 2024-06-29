package himanshu.designpattern.creatinal.singleton;

import himanshu.designpattern.creatinal.singleton.Employee;

import java.io.*;

public class SingletonUsingSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutput objectOutputStream=new ObjectOutputStream(new FileOutputStream("file.txt"));
        Employee instance = Employee.getInstance();
        objectOutputStream.writeObject(instance);
        System.out.println(instance);
        ObjectInput objectInputStream= new ObjectInputStream(new FileInputStream("file.txt"));
        System.out.println(objectInputStream.readObject());

    }
}
