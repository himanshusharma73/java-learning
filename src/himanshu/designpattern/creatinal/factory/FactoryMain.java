package himanshu.designpattern.creatinal.factory;

public class FactoryMain {
    public static void main(String[] args) {
        new OperatingSystemFactory().getInstance("ios").spec();
    }
}

/*
* The Factory Design Pattern is one of the creational design patterns in Java.
* It provides a way to create objects without specifying the exact class of the object that will be created.
* The idea is to delegate the responsibility of object creation to a factory class, instead of directly instantiating objects using the new keyword.

This pattern helps to achieve the following:
Encapsulation of object creation logic.
Code reusability by avoiding code duplication for creating similar objects.
Flexibility in terms of object creation by changing the factory's implementation without modifying the client code.
*/

/*
* it returns the object based on some criteria send by client
* we didn't hardcode the object creation
* */