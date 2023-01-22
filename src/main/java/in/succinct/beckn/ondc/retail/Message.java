package in.succinct.beckn.ondc.retail;

public class Message extends in.succinct.beckn.Message {
    public Message() {super();}

    public String getOrderId(){
        return get("order_id");
    }
    public void setOrderId(String order_id){
        set("order_id",order_id);
    }

    public String getCancellationReasonId(){
        return get("cancellation_reason_id");
    }
    public void setCancellationReasonId(String cancellation_reason_id){
        set("cancellation_reason_id",cancellation_reason_id);
    }
}
