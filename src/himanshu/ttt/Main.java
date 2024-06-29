package himanshu.ttt;

interface T1 {
    void display();
}

class A implements T1 {
    private String message;

    A(String message) {
        this.message = message;
    }

    @Override
    public void display() {
        System.out.println("A: " + message);
    }
}

class B implements T1 {
    private int number;

    B(int number) {
        this.number = number;
    }

    @Override
    public void display() {
        System.out.println("B: " + number);
    }
}

class Test<T extends T1> {
    private T obj;

    Test(T obj) {
        this.obj = obj;
    }

    public void execute() {
        obj.display();
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A("Hello, World!");
        B b = new B(42);

        Test<A> testA = new Test<>(a);
        Test<B> testB = new Test<>(b);

        testA.execute();
        testB.execute();
    }
}
