package in.succinct.beckn.ondc.retail;

import java.util.HashSet;
import java.util.Set;

public class Category extends in.succinct.beckn.Category {
    public Category(){
        super();
    }

    public String getId(){
        return get("id");
    }
    static final Set<String> CATEGORY_ID = new HashSet<String>(){{
        add("Packaged Commodities");
        add("Packaged Food");
        add("Food & Beverages");
        add("Fashion");
        add("Home Decor");
    }};
    public void setId(String id){
        if (!CATEGORY_ID.contains(id)){
            throw new IllegalArgumentException();
        }
        set("id",id);
    }
}
