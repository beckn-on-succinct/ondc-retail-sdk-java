package in.succinct.beckn.ondc.retail;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

public class Fulfillment extends in.succinct.beckn.Fulfillment {
    public Fulfillment(){
        super();
    }
    public Set<String> getFulfillmentTypes(){
        return TYPES;
    }
    static final Set<String> TYPES = new HashSet<String>(){{
        add("Delivery");
        add("Pickup");
        add("Delivery and Pickup");
        add("Reverse QC");
    }};

    public String getCategory(){
        return get("@org/ondc/category");
    }
    public void setCategory(String category){
        set("@org/ondc/category",category);
    }

    public Duration getTAT(){
        return Duration.parse(get("@org/ondc/TAT"));
    }
    public void setTAT(Duration TAT){
        set("@org/ondc/TAT",TAT.toString());
    }


    public String getProviderName(){
        return get("@org/ondc/provider_name");
    }
    public void setProviderName(String provider_name){
        set("@org/ondc/provider_name",provider_name);
    }


}
