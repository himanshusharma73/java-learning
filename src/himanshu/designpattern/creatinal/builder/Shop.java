package himanshu.designpattern.creatinal.builder;

public class Shop {
    public static void main(String[] args) {
        Phone phone= Phone.builder().battery(3500).os("Android").build();
        System.out.println(phone);

//        Phone phone=new PhoneBuilder().setBattery(3500).setDisplay(5.25).build();
//        System.out.println(phone);
    }
}
