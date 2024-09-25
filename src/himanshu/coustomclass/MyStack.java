package himanshu.coustomclass;

public class MyStack<T> {
    private int size;
    private int top = -1;

    private final int DEFAULT_SIZE = 5;

    T[] arr;

    MyStack() {
        this.size = DEFAULT_SIZE;
        arr = (T[]) new Object[size];
    }

    MyStack(int size) {
        this.size = size;
        arr = (T[]) new Object[size];
    }

    public void push(T element) {
        if (top == size - 1) {
            throw new RuntimeException("Stack Overflow");
        }
        arr[++top] = element;
    }

    public T pop() {
        if (top <= -1) {
            throw new RuntimeException("Empty Stack");
        }
        T elementsToBeReturned = arr[top];
        top--;
        return elementsToBeReturned;
    }

    public T peek() {
        return arr[top];
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }

    }
}

class Mani {
    public static void main(String[] args) {
        MyStack<Integer> integerMyStack = new MyStack<>(5);
        integerMyStack.push(10);
        integerMyStack.push(20);
        integerMyStack.push(30);
        integerMyStack.push(40);
        integerMyStack.push(50);
        //integerMyStack.push(50);

        integerMyStack.print();


        integerMyStack.peek();
        System.out.println("\n" + integerMyStack.peek());
        integerMyStack.print();


        System.out.println("\npeaked value" + integerMyStack.pop());
        integerMyStack.print();

        System.out.println("\npeaked value" + integerMyStack.pop());
        integerMyStack.print();

        System.out.println("\npeaked value" + integerMyStack.pop());
        integerMyStack.print();

        System.out.println("\npeaked value" + integerMyStack.pop());
        integerMyStack.print();

        System.out.println("\npeaked value" + integerMyStack.pop());
        integerMyStack.print();

    }
}
