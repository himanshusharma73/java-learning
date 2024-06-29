package himanshu.interviewproblem;

class Test {
    static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName()
                           + " = " + element);
    }
 
    public static void main(String[] args)
    {
        genericDisplay(11);
 
        genericDisplay("GeeksForGeeks");
 
        genericDisplay(1.0f);
    }
}

class Test2{
    static void genericDisplay(Integer element)
    {
        System.out.println(element.getClass().getName()
                + " = " + element);
    }

    static void genericDisplay(String element)
    {
        System.out.println(element.getClass().getName()
                + " = " + element);
    }

    static void genericDisplay(Double element)
    {
        System.out.println(element.getClass().getName()
                + " = " + element);
    }

    public static void main(String[] args)
    {
        genericDisplay(11);

        genericDisplay("GeeksForGeeks");

        genericDisplay(1.0);
    }
}
