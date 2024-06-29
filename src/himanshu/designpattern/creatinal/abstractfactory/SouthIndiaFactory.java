package himanshu.designpattern.creatinal.abstractfactory;

public class SouthIndiaFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Swift();
    }

    @Override
    public CarSpecification createSpecification() {
        return new SouthIndiaSpecification();
    }
}
