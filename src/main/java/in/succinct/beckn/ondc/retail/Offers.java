package in.succinct.beckn.ondc.retail;

import in.succinct.beckn.BecknObjectsWithId;
import org.json.simple.JSONArray;

public class Offers extends BecknObjectsWithId<Offer> {
    public Offers() { super(); }

    public Offers(JSONArray p){
        super(p);
    }
}
