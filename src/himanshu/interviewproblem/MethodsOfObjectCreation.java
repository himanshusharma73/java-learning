package himanshu.interviewproblem;

import java.lang.reflect.InvocationTargetException;

public class MethodsOfObjectCreation implements Cloneable {
    int a=10;
    String name= "Himanshu";

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, CloneNotSupportedException {
        //first method by using new keyword

        MethodsOfObjectCreation methodsOfObjectCreation=new MethodsOfObjectCreation();
        System.out.println("by using new keyword");
        System.out.println(methodsOfObjectCreation.a);
        System.out.println(methodsOfObjectCreation.name);


        // by using newInstance method of class "Class"

        MethodsOfObjectCreation methodsOfObjectCreation1=MethodsOfObjectCreation.class.newInstance();
        System.out.println("using new Instance method of class Class");
        System.out.println(methodsOfObjectCreation1.a);
        System.out.println(methodsOfObjectCreation1.name);


        // by using newInstance method of class "Constructor"

        MethodsOfObjectCreation methodsOfObjectCreation2=MethodsOfObjectCreation.class.getConstructor().newInstance();
        System.out.println("using new Instance method of class Constructor");
        System.out.println(methodsOfObjectCreation2.a);
        System.out.println(methodsOfObjectCreation2.name);


        // using clone method
        MethodsOfObjectCreation methodsOfObjectCreation3= (MethodsOfObjectCreation) methodsOfObjectCreation.clone();
        System.out.println("using clone method");
        System.out.println(methodsOfObjectCreation3.a);
        System.out.println(methodsOfObjectCreation3.name);
    }
}
