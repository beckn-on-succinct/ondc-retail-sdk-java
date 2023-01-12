package in.succinct.beckn.ondc.retail;

import java.util.HashSet;
import java.util.Set;

public class Fulfillment extends in.succinct.beckn.Fulfillment {
    public Fulfillment(){
        super();
    }
    public Fulfillment(String payload){
        super(payload);
    }

    public String getFulfillmentType(){
        return get("type");
    }
    static final Set<String> TYPES = new HashSet<String>(){{
        add("Delivery");
        add("Pickup");
        add("Delivery and Pickup");
        add("Reverse QC");
    }};
    public void setFulfillmentType(String type){
        if (!TYPES.contains(type)){
            throw new IllegalArgumentException();
        }
        set("type",type);
    }

    public String getCategory(){
        return get("@org/ondc/category");
    }
    public void setCategory(String category){
        set("@org/ondc/category",category);
    }

    public String getTAT(){
        return get("@org/ondc/TAT");
    }
    public void setTAT(String TAT){
        set("@org/ondc/TAT",TAT);
    }

    public String getProviderId(){
        return get("provider_id");
    }
    public void setProviderId(String provider_id){
        set("provider_id",provider_id);
    }

    public String getProviderName(){
        return get("@org/ondc/provider_name");
    }
    public void setProviderName(String provider_name){
        set("@org/ondc/provider_name",provider_name);
    }

    public int getRating(){
        return get("rating");
    }
    public void setRating(int rating){
        set("rating",rating);
    }

    public Contact getContact(){
        return get(Contact.class,"contact");
    }
    public void setContact(Contact contact){
        set("contact",contact.getInner());
    }

    public FulfillmentStop getStart(){
        return get(FulfillmentStop.class,"start");
    }
    public void setStart(FulfillmentStop start){
        set("start",start.getInner());
    }

    public FulfillmentStop getEnd(){
        return get(FulfillmentStop.class,"end");
    }
    public void setEnd(FulfillmentStop end){
        set("end",end.getInner());
    }

    public boolean getRateable(){
        return get("rateable");
    }
    public void setRateable(boolean rateable){
        set("rateable",rateable);
    }
}
