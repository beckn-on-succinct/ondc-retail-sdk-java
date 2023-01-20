package in.succinct.beckn.ondc.retail;

import in.succinct.beckn.BecknObjectWithId;
import in.succinct.beckn.BecknObjectsWithId;

import java.util.HashSet;
import java.util.Set;

public class Payment extends in.succinct.beckn.Payment {

    public Payment(){
        super();
    }
    public Payment(String payload){
        super(payload);
    }

    public String getCollectedBy(){
        return get("collected_by");
    }
    static final Set<String> COLLECTED_BY = new HashSet<String>(){{
        add("BAP");
        add("BPP");
    }};
    public void setCollectedBy(String collected_by){
        if (!COLLECTED_BY.contains(collected_by)){
            throw new IllegalArgumentException();
        }
        set("collected_by",collected_by);
    }

    public String getCollectedByStatus(){
        return get("@ondc/org/collected_by_status");
    }
    static final Set<String> COLLECTED_BY_STATUS = new HashSet<String>(){{
        add("Assert");
        add("Agree");
        add("Disagree");
        add("Terminate");
    }};
    public void setCollectedByStatus(String collected_by_status){
        if (!COLLECTED_BY.contains(collected_by_status)){
            throw new IllegalArgumentException();
        }
        set("@ondc/org/collected_by_status",collected_by_status);
    }

    public String getBuyerAppFinderFeeType() {
        return get("@ondc/org/buyer_app_finder_fee_type");
    }

    static final Set<String> FINDER_FEE_TYPES = new HashSet<String>(){{
        add("Percent");
        add("Amount");
    }};

    public void setBuyerAppFinderFeeType(String buyer_app_finder_fee_type) {
        if (!FINDER_FEE_TYPES.contains(buyer_app_finder_fee_type)){
            throw new IllegalArgumentException();
        }
        set("@ondc/org/buyer_app_finder_fee_type", buyer_app_finder_fee_type);
    }

    public double getBuyerAppFinderFeeAmount(){
        return getDouble("@ondc/org/buyer_app_finder_fee_amount");
    }
    public void setBuyerAppFinderFeeAmount(double buyer_app_finder_fee_amount){
        set("@ondc/org/buyer_app_finder_fee_amount",buyer_app_finder_fee_amount);
    }

    public double getWithholdingAmount(){
        return getDouble("@ondc/org/withholding_amount");
    }
    public void setWithholdingAmount(double withholding_amount){
        set("@ondc/org/withholding_amount",withholding_amount);
    }

    public String getWithholdingAmountStatus(){
        return get("@ondc/org/withholding_amount_status");
    }
    static final Set<String> WITHHOLDING_AMOUNT_STATUS = new HashSet<String>(){{
        add("Assert");
        add("Agree");
        add("Disagree");
        add("Terminate");
    }};
    public void setWithholdingAmountStatus(String withholding_amount_status){
        if (!WITHHOLDING_AMOUNT_STATUS.contains(withholding_amount_status)){
            throw new IllegalArgumentException();
        }
        set("@ondc/org/withholding_amount_status",withholding_amount_status);
    }

    public String getReturnWindow(){
        return get("@ondc/org/return_window");
    }
    public void setReturnWindow(String return_window){
        set("@ondc/org/return_window",return_window);
    }

    public String getReturnWindowStatus(){
        return get("@ondc/org/return_window_status");
    }
    static final Set<String> RETURN_WINDOW_STATUS = new HashSet<String>(){{
        add("Assert");
        add("Agree");
        add("Disagree");
        add("Terminate");
    }};
    public void setReturnWindowStatus(String return_window_status){
        if (!RETURN_WINDOW_STATUS.contains(return_window_status)){
            throw new IllegalArgumentException();
        }
        set("@ondc/org/return_window_status",return_window_status);
    }

    public String getSettlementBasisStatus(){
        return get("@ondc/org/settlement_basis_status");
    }
    static final Set<String> SETTLEMENT_BASIS_STATUS = new HashSet<String>(){{
        add("Assert");
        add("Agree");
        add("Disagree");
        add("Terminate");
    }};
    public void setSettlementBasisStatus(String settlement_basis_status){
        if (!SETTLEMENT_BASIS_STATUS.contains(settlement_basis_status)){
            throw new IllegalArgumentException();
        }
        set("@ondc/org/settlement_basis_status",settlement_basis_status);
    }

    public String getSettlementBasis(){
        return get("@ondc/org/settlement_basis");
    }
    static final Set<String> SETTLEMENT_BASIS = new HashSet<String>(){{
        add("Collection");
        add("Shipment");
        add("Delivery");
    }};
    public void setSettlementBasis(String settlement_basis){
        if (!SETTLEMENT_BASIS.contains(settlement_basis)){
            throw new IllegalArgumentException();
        }
        set("@ondc/org/settlement_basis",settlement_basis);
    }

    public String getSettlementWindow(){
        return get("@ondc/org/settlement_window");
    }
    public void setSettlementWindow(String settlement_window){
        set("@ondc/org/settlement_window",settlement_window);
    }

    public String getSettlementWindowStatus(){
        return get("@ondc/org/settlement_window_status");
    }
    static final Set<String> SETTLEMENT_WINDOW_STATUS = new HashSet<String>(){{
        add("Assert");
        add("Agree");
        add("Disagree");
        add("Terminate");
    }};
    public void setSettlementWindowStatus(String settlement_window_status){
        if (!SETTLEMENT_WINDOW_STATUS.contains(settlement_window_status)){
            throw new IllegalArgumentException();
        }
        set("@ondc/org/settlement_window_status",settlement_window_status);
    }

    public SettlementDetail getSettlementDetails(){
        return get(SettlementDetail.class,"@org/ondc/settlement_details");
    }
    public void setSettlementDetails(SettlementDetail settlement_details){
        set("@org/ondc/settlement_details",settlement_details.getInner());
    }

    public static class Params extends in.succinct.beckn.Payment.Params {

    }

}
