package himanshu.designpattern.creatinal.factory;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemFactory operatingSystemFactory= new OperatingSystemFactory();
        Os os=operatingSystemFactory.getInstance("ANDROID");
                os.spec();
    }
}


/*
* it returns the object based on some criteria send by client
* we didn't hardcode the object creation
* */