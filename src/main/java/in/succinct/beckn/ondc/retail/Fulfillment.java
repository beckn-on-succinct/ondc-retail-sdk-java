package in.succinct.beckn.ondc.retail;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

public class Fulfillment extends in.succinct.beckn.Fulfillment {
    public Fulfillment(){
        super();
    }
    @Override
    public Set<String> getFulfillmentTypes(){
        return ONDC_TYPES;
    }
    static final Set<String> ONDC_TYPES = new HashSet<String>(){{
        add("Delivery");
        add("Pickup");
        add("Delivery and Pickup");
        add("Reverse QC");
    }};
    @Override
    public String getCategory(){
        return get("@org/ondc/category");
    }
    @Override
    public void setCategory(String category){
        set("@org/ondc/category",category);
    }
    @Override
    public Duration getTAT(){
        return Duration.parse(get("@org/ondc/TAT"));
    }
    @Override
    public void setTAT(Duration TAT){
        set("@org/ondc/TAT",TAT.toString());
    }


    @Override
    public String getProviderName(){
        return get("@org/ondc/provider_name");
    }
    @Override
    public void setProviderName(String provider_name){
        set("@org/ondc/provider_name",provider_name);
    }


}
