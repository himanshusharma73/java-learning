package himanshu.oops.polymorphism;

public class Test {
    public static void main(String[] args) {
        Area area=new Area();
        area.area();
        Area square=new Square();
        square.area();
        Area circle=new Circle();
        circle.area();
    }
}
