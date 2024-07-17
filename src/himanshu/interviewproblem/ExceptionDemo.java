package himanshu.interviewproblem;

import java.util.NoSuchElementException;

public class ExceptionDemo {

    public static void main(String[] args) {
        System.out.println(exception());
    }

    public static int exception(){
        try{
           return 0;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return -3;
        }
    }
}
