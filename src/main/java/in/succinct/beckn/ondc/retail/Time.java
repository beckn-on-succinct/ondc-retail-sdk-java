package in.succinct.beckn.ondc.retail;
public class Time extends in.succinct.beckn.Time {
    public Time() {
        super();
    }

    public Schedule getSchedule(){
        return get(Schedule.class,"schedule");
    }
    public void setSchedule(Schedule schedule){
        set("schedule",schedule.getInner());
    }
}
