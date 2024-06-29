package himanshu.designpattern.adg;

public class OperatingFactory {
    public static OS getOS(String os){
        if (os.equalsIgnoreCase("android"))
            return new Android();
        if (os.equalsIgnoreCase("ios")){
            return new Ios();
        }
        return new Window();
    }
}
