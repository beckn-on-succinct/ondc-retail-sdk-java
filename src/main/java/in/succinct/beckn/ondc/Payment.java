package in.succinct.beckn.ondc;

public class Payment extends in.succinct.beckn.Payment {

    public Payment(){
        super();
    }
    public Payment(String payload){
        super(payload);
    }
    
    public static class Params extends in.succinct.beckn.Payment.Params {
        public String getBuyerAppFinderFeeType() {
            return get("buyer_app_finder_fee_type");
        }

        public void setBuyerAppFinderFeeType(String buyer_app_finder_fee_type) {
            set("buyer_app_finder_fee_type", buyer_app_finder_fee_type);
        }
    }
    
}
