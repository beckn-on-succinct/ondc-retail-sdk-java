package in.succinct.beckn.ondc.retail;

import in.succinct.beckn.BecknObject;
import java.util.HashSet;
import java.util.Set;

public class Scalar extends BecknObject {
    public Scalar() { super(); }

    public String getValue(){
        return get("value");
    }
    public void setValue(String value){
        set("value",value);
    }

    public String getUnit(){
        return get("unit");
    }
    public void setUnit(String unit){
        set("unit",unit);
    }

    public String getEstimatedValue(){
        return get("estimated_value");
    }
    public void setEstimatedValue(String estimated_value){
        set("estimated_value",estimated_value);
    }

    public String getComputedValue(){
        return get("computed_value");
    }
    public void setComputedValue(String computed_value){
        set("computed_value",computed_value);
    }

    public String getType(){
        return get("type");
    }
    static final Set<String> TYPES = new HashSet<String>(){{
        add("CONSTANT");
        add("VARIABLE");
    }};
    public void setType(String type){
        if (!TYPES.contains(type)){
            throw new IllegalArgumentException();
        }
        set("type",type);
    }

    public Range getRange(){
        return get(Range.class,"range");
    }
    public void setRange(Range range){
        set("range",range.getInner());
    }
}
