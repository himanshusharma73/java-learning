package himanshu.designpattern.creatinal.factory;

public class OperatingSystemFactory {
    public Os getInstance(String str){
        if (str.equalsIgnoreCase("Android"))
        return new AndroidOs();
        else if (str.equalsIgnoreCase("Ios"))
            return new Ios();
        else return new WindowOs();
    }
}
