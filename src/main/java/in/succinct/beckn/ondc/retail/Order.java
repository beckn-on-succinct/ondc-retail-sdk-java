package in.succinct.beckn.ondc.retail;

import in.succinct.beckn.Cancellation;

public class Order extends in.succinct.beckn.Order {
    public Order() { super(); }

    public Cancellation getCancellation(){
        return get(Cancellation.class,"@org/ondc/cancellation");
    }
    public void setCancellation(Cancellation cancellation){
        set("@org/ondc/cancellation",cancellation.getInner());
    }


}
