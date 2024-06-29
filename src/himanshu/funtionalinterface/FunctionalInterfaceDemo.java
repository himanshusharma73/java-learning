package himanshu.funtionalinterface;

public interface FunctionalInterfaceDemo {
    void print();
}

class Demo{
    public static void main(String[] args) {
        FunctionalInterfaceDemo functionalInterfaceDemo=() -> System.out.println("functional interface");
        functionalInterfaceDemo.print();
    }
}