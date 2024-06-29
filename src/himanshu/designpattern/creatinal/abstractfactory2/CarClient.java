package himanshu.designpattern.creatinal.abstractfactory2;

public class CarClient {

    public static void main(String[] args) {
        CarFactory carFactory = new AltoCarFactory();
        carFactory.createCar().assembleCar();

    }
}
