package himanshu.oops.inheritance;

public interface X {
    default String print(int a){
        System.out.println("print in x");
        return "x";
    }
}
