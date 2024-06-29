package himanshu.oops.inheritance;

public class Shape1 extends Shape {
    public int c;

    Shape1(int a, int b, int c){
        /*super.a=a;
       super.b=b;*/
        super(a,b);
        this.c=c;
    }
}
