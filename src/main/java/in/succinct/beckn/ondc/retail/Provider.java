package in.succinct.beckn.ondc.retail;
public class Provider extends in.succinct.beckn.Provider {
    public Provider(){
        super();
    }
    public Provider(String payload){
        super(payload);
    }

    public String getCategoryId(){
        return get("category_id");
    }
    public void setCategoryId(String category_id){
        set("category_id",category_id);
    }

    public String getFssaiLicenceNo(){
        return get("@org/ondc/fssai_licence_no");
    }
    public void setFssaiLicenceNo(String fssai_licence_no){
        set("@org/ondc/fssai_licence_no",fssai_licence_no);
    }

    public Rating getRating(){
        return get(Rating.class,"rating");
    }
    public void setRating(Rating rating){
        set("rating",rating.getInner());
    }

    public Time getTime(){
        return get(Time.class,"time");
    }
    public void setTime(Time time){
        set("time",time.getInner());
    }

    public boolean getRateable(){
        return get("rateable");
    }
    public void setRateable(boolean rateable){
        set("rateable",rateable);
    }
}
