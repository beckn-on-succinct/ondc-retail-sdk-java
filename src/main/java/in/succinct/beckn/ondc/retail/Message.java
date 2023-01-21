package in.succinct.beckn.ondc.retail;

public class Message extends in.succinct.beckn.Message {
    public Message() {super();}

    public String getOrderId(){
        return get("order_id");
    }
    public void setOrderId(String order_id){
        set("order_id",order_id);
    }
}
