package in.succinct.beckn.ondc.retail;

import java.util.HashSet;
import java.util.Set;

public class Category extends in.succinct.beckn.Category {
    public Category(){
        super();
    }

    @Override
    public String getId(){
        return get("id");
    }
    static final Set<String> ONDC_CATEGORY_ID = new HashSet<>(){{
        add("Packaged Commodities");
        add("Packaged Food");
        add("Food & Beverages");
        add("Fashion");
        add("Home Decor");
    }};
    @Override
    public void setId(String id){
        if (!ONDC_CATEGORY_ID.contains(id)){
            throw new IllegalArgumentException();
        }
        set("id",id);
    }
}
