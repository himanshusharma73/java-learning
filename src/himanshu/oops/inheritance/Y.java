package himanshu.oops.inheritance;

public interface Y {
    default int print(int a, int b){
        System.out.println("print in y");
        return 1;
    }
}
