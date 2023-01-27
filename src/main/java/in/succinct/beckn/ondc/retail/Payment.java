package in.succinct.beckn.ondc.retail;

import in.succinct.beckn.SettlementDetails;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

public class Payment extends in.succinct.beckn.Payment {

    public Payment(){
        super();
    }
    public Payment(String payload){
        super(payload);
    }

    @Override
    public String getCollectedByStatus(){
        return get("@ondc/org/collected_by_status");
    }
    static final Set<String> COLLECTED_BY_STATUS = new HashSet<String>(){{
        add("Assert");
        add("Agree");
        add("Disagree");
        add("Terminate");
    }};
    @Override
    public void setCollectedByStatus(String collected_by_status){
        if (!COLLECTED_BY_STATUS.contains(collected_by_status)){
            throw new IllegalArgumentException();
        }
        set("@ondc/org/collected_by_status",collected_by_status);
    }

    @Override
    public String getBuyerAppFinderFeeType() {
        return get("@ondc/org/buyer_app_finder_fee_type");
    }

    static final Set<String> FINDER_FEE_TYPES = new HashSet<String>(){{
        add("Percent");
        add("Amount");
    }};
    @Override
    public void setBuyerAppFinderFeeType(String buyer_app_finder_fee_type) {
        if (!FINDER_FEE_TYPES.contains(buyer_app_finder_fee_type)){
            throw new IllegalArgumentException();
        }
        set("@ondc/org/buyer_app_finder_fee_type", buyer_app_finder_fee_type);
    }

    @Override
    public double getBuyerAppFinderFeeAmount(){
        return getDouble("@ondc/org/buyer_app_finder_fee_amount");
    }
    @Override
    public void setBuyerAppFinderFeeAmount(double buyer_app_finder_fee_amount){
        set("@ondc/org/buyer_app_finder_fee_amount",buyer_app_finder_fee_amount);
    }

    @Override
    public double getWithholdingAmount(){
        return getDouble("@ondc/org/withholding_amount");
    }
    @Override
    public void setWithholdingAmount(double withholding_amount){
        set("@ondc/org/withholding_amount",withholding_amount);
    }

    @Override
    public String getWithholdingAmountStatus(){
        return get("@ondc/org/withholding_amount_status");
    }
    static final Set<String> WITHHOLDING_AMOUNT_STATUS = new HashSet<String>(){{
        add("Assert");
        add("Agree");
        add("Disagree");
        add("Terminate");
    }};
    @Override
    public void setWithholdingAmountStatus(String withholding_amount_status){
        if (!WITHHOLDING_AMOUNT_STATUS.contains(withholding_amount_status)){
            throw new IllegalArgumentException();
        }
        set("@ondc/org/withholding_amount_status",withholding_amount_status);
    }

    @Override
    public Duration getReturnWindow(){
        String rw = get("@ondc/org/return_window");
        return rw == null ? null : Duration.parse(rw);
    }
    @Override
    public void setReturnWindow(Duration return_window){
        set("@ondc/org/return_window",return_window == null ? null : return_window.toString());
    }

    @Override
    public String getReturnWindowStatus(){
        return get("@ondc/org/return_window_status");
    }
    static final Set<String> RETURN_WINDOW_STATUS = new HashSet<String>(){{
        add("Assert");
        add("Agree");
        add("Disagree");
        add("Terminate");
    }};
    @Override
    public void setReturnWindowStatus(String return_window_status){
        if (!RETURN_WINDOW_STATUS.contains(return_window_status)){
            throw new IllegalArgumentException();
        }
        set("@ondc/org/return_window_status",return_window_status);
    }

    @Override
    public String getSettlementBasisStatus(){
        return get("@ondc/org/settlement_basis_status");
    }
    static final Set<String> SETTLEMENT_BASIS_STATUS = new HashSet<String>(){{
        add("Assert");
        add("Agree");
        add("Disagree");
        add("Terminate");
    }};
    @Override
    public void setSettlementBasisStatus(String settlement_basis_status){
        if (!SETTLEMENT_BASIS_STATUS.contains(settlement_basis_status)){
            throw new IllegalArgumentException();
        }
        set("@ondc/org/settlement_basis_status",settlement_basis_status);
    }

    @Override
    public String getSettlementBasis(){
        return get("@ondc/org/settlement_basis");
    }
    static final Set<String> SETTLEMENT_BASIS = new HashSet<String>(){{
        add("Collection");
        add("Shipment");
        add("Delivery");
    }};
    @Override
    public void setSettlementBasis(String settlement_basis){
        if (!SETTLEMENT_BASIS.contains(settlement_basis)){
            throw new IllegalArgumentException();
        }
        set("@ondc/org/settlement_basis",settlement_basis);
    }

    @Override
    public Duration getSettlementWindow(){
        String sw =  get("@ondc/org/settlement_window");
        return sw == null ? null : Duration.parse(sw);
    }
    @Override
    public void setSettlementWindow(Duration settlement_window){
        set("@ondc/org/settlement_window",settlement_window== null ? null : settlement_window.toString());
    }

    @Override
    public String getSettlementWindowStatus(){
        return get("@ondc/org/settlement_window_status");
    }
    static final Set<String> SETTLEMENT_WINDOW_STATUS = new HashSet<String>(){{
        add("Assert");
        add("Agree");
        add("Disagree");
        add("Terminate");
    }};
    @Override
    public void setSettlementWindowStatus(String settlement_window_status){
        if (!SETTLEMENT_WINDOW_STATUS.contains(settlement_window_status)){
            throw new IllegalArgumentException();
        }
        set("@ondc/org/settlement_window_status",settlement_window_status);
    }

    @Override
    public SettlementDetails getSettlementDetails(){
        return get(SettlementDetails.class,"@org/ondc/settlement_details");
    }
    @Override
    public void setSettlementDetails(SettlementDetails settlement_details){
        set("@org/ondc/settlement_details",settlement_details.getInner());
    }


}
