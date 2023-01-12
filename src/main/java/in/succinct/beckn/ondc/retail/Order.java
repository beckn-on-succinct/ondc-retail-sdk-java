package in.succinct.beckn.ondc.retail;

public class Order extends in.succinct.beckn.Order {
    public Order() { super(); }

    public Cancellation getCancellation(){
        return get(Cancellation.class,"@org/ondc/cancellation");
    }
    public void setCancellation(Cancellation cancellation){
        set("@org/ondc/cancellation",cancellation.getInner());
    }

    public Documents getDocuments(){
        return get(Documents.class,"documents");
    }
    public void setDocuments(Documents documents){
        set("documents",documents.getInner());
    }
}
