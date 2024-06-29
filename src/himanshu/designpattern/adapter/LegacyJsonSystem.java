package himanshu.designpattern.adapter;

class LegacyJsonSystem implements ILegacyJsonSystem {

    @Override
    public String fetchDataInJson() {
        // Simulate fetching data from legacy system in JSON format
        return "{\"name\": \"John\", \"age\": 30}";
    }
}