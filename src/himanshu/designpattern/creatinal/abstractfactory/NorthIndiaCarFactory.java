package himanshu.designpattern.creatinal.abstractfactory;

public class NorthIndiaCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new Alto();
    }

    @Override
    public CarSpecification createSpecification() {
        return new NorthIndiaSpecification();
    }
}
