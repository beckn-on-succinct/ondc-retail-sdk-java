package in.succinct.beckn.ondc.retail;

import in.succinct.beckn.BreakUp;
import in.succinct.beckn.Item;
import in.succinct.beckn.Quantity;

import java.util.HashSet;
import java.util.Set;

public class BreakUpElement extends BreakUp.BreakUpElement {
    public BreakUpElement(){
        super();
    }

    @Override
    public String getItemId(){
        return get("@ondc/org/item_id");
    }
    @Override
    public void setItemId(String item_id){
        set("@ondc/org/item_id",item_id);
    }

    @Override
    public Quantity getItemQuantity(){
        return get(Quantity.class,"@ondc/org/item_quantity");
    }
    @Override
    public void setItemQuantity(Quantity quantity){
        set("@ondc/org/item_quantity",quantity);
    }


    public String getTitleType(){
        return get("@ondc/org/title_type");
    }
    static final Set<String> TITLE_TYPE = new HashSet<String>(){{
        add("item");
        add("delivery");
        add("packing");
        add("tax");
        add("misc");
        add("discount");
    }};
    public void setTitleType(String title_type){
        if (!TITLE_TYPE.contains(title_type)){
            throw new IllegalArgumentException();
        }
        set("@ondc/org/title_type",title_type);
    }

    @Override
    public String getType(){
        return getTitleType();
    }
    @Override
    public void setType(String type){
        setTitleType(type);
    }



}
