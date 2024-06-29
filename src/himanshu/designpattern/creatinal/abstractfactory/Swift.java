package himanshu.designpattern.creatinal.abstractfactory;

public class Swift implements Car{
    @Override
    public void createCar() {
        System.out.println("Assembling Swift car");
    }
}
