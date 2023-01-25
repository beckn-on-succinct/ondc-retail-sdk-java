package in.succinct.beckn.ondc.retail;

import in.succinct.beckn.BreakUp;
import in.succinct.beckn.Item;
import in.succinct.beckn.Quantity;

import java.util.HashSet;
import java.util.Set;

public class BreakUpElement extends BreakUp.BreakUpElement {
    public BreakUpElement(BreakUp.BreakUpElement element){
        super();
    }

    public String getItemId(){
        return get("@ondc/org/item_id");
    }
    public void setItemId(String item_id){
        set("@ondc/org/item_id",item_id);
    }

    public Quantity getItemQuantity(){
        return get(Quantity.class,"@ondc/org/item_quantity");
    }
    public void setItemQuantity(Quantity quantity){
        set("@ondc/org/item_quantity",quantity.getInner());
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

    public Item getItem(){
        return get(Item.class,"item");
    }
    public void setItem(Item item){
        set("item",item.getInner());
    }

}
