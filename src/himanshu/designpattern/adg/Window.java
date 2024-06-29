package himanshu.designpattern.adg;

import himanshu.designpattern.creatinal.factory.Os;

public class Window implements OS{
    @Override
    public void spec() {
        System.out.println("Window OS");
    }
}
