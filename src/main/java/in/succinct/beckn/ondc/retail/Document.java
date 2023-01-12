package in.succinct.beckn.ondc.retail;

public class Document extends in.succinct.beckn.BecknObject {
    public Document() {super(); }

    public String getUrl(){
        return get("url");
    }
    public void setUrl(String url){
        set("url",url);
    }

    public String getLabel(){
        return get("label");
    }
    public void setLabel(String label){
        set("label",label);
    }

}
