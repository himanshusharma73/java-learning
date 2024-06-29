package himanshu.designpattern.creatinal.abstractfactory2;

public class SwiftCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Swift();
    }
}
