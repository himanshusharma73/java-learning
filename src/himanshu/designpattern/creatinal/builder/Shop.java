package himanshu.designpattern.creatinal.builder;

public class Shop {
    public static void main(String[] args) {
        Phone phone= Phone.builder().battery(3500).  os("Android").build();
        System.out.println(phone);
    }
}
