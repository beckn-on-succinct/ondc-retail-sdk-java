package in.succinct.beckn.ondc.retail;

import in.succinct.beckn.BecknObject;

public class ItemQuantityType extends BecknObject {
    public ItemQuantityType() {super();}

    public Integer getCount(){
        return getInteger("count");
    }
    public void setCount(Integer count){
        set("count",count);
    }

    public Scalar getMeasure(){
        return get(Scalar.class,"measure");
    }
    public void setMeasure(Scalar measure){
        set("measure",measure.getInner());
    }

}
