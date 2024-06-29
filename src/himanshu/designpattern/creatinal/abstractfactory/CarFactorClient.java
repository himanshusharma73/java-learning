package himanshu.designpattern.creatinal.abstractfactory;

public class CarFactorClient {
    public static void main(String[] args) {
        CarFactory carFactory = new NorthIndiaCarFactory();
        Car northCar = carFactory.createCar();
        CarSpecification northCarSpecification = carFactory.createSpecification();
        northCar.createCar();
        northCarSpecification.display();

        System.out.println("//////////////////////////");
        CarFactory carFactory1 = new SouthIndiaFactory();
        Car southCar = carFactory1.createCar();
        CarSpecification southCarSpecification = carFactory1.createSpecification();
        southCar.createCar();
        southCarSpecification.display();
    }
}
