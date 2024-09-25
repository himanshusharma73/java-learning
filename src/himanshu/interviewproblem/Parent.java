package himanshu.interviewproblem;

public class Parent {
    void print(){
        System.out.println("In parent class print method");
    }
}

class Child extends Parent{
    void print(){
        System.out.println("In child class print method");
    }

    public static void main(String[] args) {
        Child child = new Child();                 // allowed
        child.print();

        //Child child1 = new Parent();            // this will throw error because may be child have more method and
                                                  // variable but parent doesn't know about these so that's why we can do that

        Parent parent = new Child();                 // allowed
        parent.print();

        Parent parent1 = new Parent();               // allowed
        parent1.print();

    }
}
