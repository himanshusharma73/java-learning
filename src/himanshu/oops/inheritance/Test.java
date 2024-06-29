package himanshu.oops.inheritance;

public class Test extends AbstractA implements X,Y{
    public static void main(String[] args) {
        Test test= new Test();
        test.print(1,2);


    }

    @Override
    void print() {
        System.out.println("print ");
    }
}
