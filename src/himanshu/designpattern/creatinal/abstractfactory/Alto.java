package himanshu.designpattern.creatinal.abstractfactory;

public class Alto implements Car{
    @Override
    public void createCar() {
        System.out.println("Assembling Alto car");
    }
}
