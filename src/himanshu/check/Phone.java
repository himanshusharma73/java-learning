package himanshu.check;

import lombok.Builder;

@Builder
public class Phone {
    private String os;
    private int ram;
    private int battery;

    private String processor;

    private double display;

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", battery=" + battery +
                ", processor='" + processor + '\'' +
                ", display=" + display +
                '}';
    }

    public Phone(String os, int ram, int battery, String processor, double display) {
        this.os = os;
        this.ram = ram;
        this.battery = battery;
        this.processor = processor;
        this.display = display;
    }

}
