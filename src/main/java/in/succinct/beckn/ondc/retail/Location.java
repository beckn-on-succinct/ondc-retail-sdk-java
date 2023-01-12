package in.succinct.beckn.ondc.retail;

public class Location extends in.succinct.beckn.Location {
    public Location() { super(); }

    public Time getTime(){
        return get(Time.class,"time");
    }
    public void setTime(Time time){
        set("time",time.getInner());
    }
}
