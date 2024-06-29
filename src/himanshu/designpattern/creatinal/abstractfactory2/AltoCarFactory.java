package himanshu.designpattern.creatinal.abstractfactory2;

public class AltoCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Alto();
    }
}
