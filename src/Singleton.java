public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){}

    public static Singleton geSingletonObject()
    {

        return  singleton;

    }
}

class test{
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.geSingletonObject();
        Singleton singleto2 = Singleton.geSingletonObject();
        Singleton singleto3 = Singleton.geSingletonObject();
        Singleton singleto4 = Singleton.geSingletonObject();
;    }
}