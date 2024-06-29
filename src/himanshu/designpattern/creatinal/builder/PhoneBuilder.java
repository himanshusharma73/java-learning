package himanshu.designpattern.creatinal.builder;

public class PhoneBuilder {
    private String os;
    private int ram;
    private int battery;
    private String processor;
    private double display;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setDisplay(double display) {
        this.display = display;
        return this;
    }

    public Phone build(){
        return new Phone(os,ram,battery,processor,display);
    }
}
