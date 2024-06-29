package himanshu.designpattern.adapter;

class JsonToXmlAdapter implements NewSystemInterface {
    private ILegacyJsonSystem legacySystem;

    public JsonToXmlAdapter(ILegacyJsonSystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    @Override
    public String        fetchDataInXml() {
        String jsonData = legacySystem.fetchDataInJson();

        String xmlData = convertJsonToXml(jsonData);
        return xmlData;
    }

    private String convertJsonToXml(String jsonData) {
        return "<data>" + jsonData + "</data>";
    }
}