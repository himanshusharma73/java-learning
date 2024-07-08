package himanshu.Ktech;

public class MarkerInterfaceDemo {
    public static void main(String[] args) {
        Main main = new Main();
        checkInstanceOf(main);
    }
    public static void checkInstanceOf(Main main){
        if (main instanceof Marker){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }

}
class Main implements Marker{
    private int id;
    private String name;
}
interface Marker{

}
