package in.succinct.beckn.ondc.retail;

import in.succinct.beckn.BecknObject;

public class Tag extends BecknObject {
    public boolean getDescription(){
        return getBoolean("description");
    }
    public void setDisplay(boolean description){
        set("description",description);
    }
    public String getAdditionalProperties(){
        return get("additionalProperties");
    }
    public void setCode(String additionalProperties){
        set("additionalProperties",additionalProperties);
    }
}
