package himanshu.designpattern.adapter;

public class Main {
    public static void main(String[] args) {
        ILegacyJsonSystem legacySystem = new LegacyJsonSystem();

        System.out.println("Received data in json format"+legacySystem.fetchDataInJson());

        JsonToXmlAdapter adapter = new JsonToXmlAdapter(legacySystem);

        System.out.println("Received data in xml format"+adapter.fetchDataInXml());
       /* Create the new system, passing the adapter
        NewSystem newSystem = new NewSystem(adapter);

        // Process data in the new system
        newSystem.process();*/
    }
}