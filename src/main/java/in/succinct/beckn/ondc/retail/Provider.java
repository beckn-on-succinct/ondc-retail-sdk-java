package in.succinct.beckn.ondc.retail;

public class Provider extends in.succinct.beckn.Provider {
    public Provider(){
        super();
    }
    public Provider(String payload){
        super(payload);
    }


    public String getFssaiLicenceNo(){
        return get("@org/ondc/fssai_licence_no");
    }
    public void setFssaiLicenceNo(String fssai_licence_no){
        set("@org/ondc/fssai_licence_no",fssai_licence_no);
    }


}
