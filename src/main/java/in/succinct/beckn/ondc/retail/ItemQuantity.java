package in.succinct.beckn.ondc.retail;

import in.succinct.beckn.BecknObject;

public class ItemQuantity extends BecknObject {
    public ItemQuantity() {super();}

    public ItemQuantityType getAllocated(){
        return get(ItemQuantityType.class,"allocated");
    }
    public void setAllocated(ItemQuantityType allocated){
        set("allocated",allocated.getInner());
    }

    public ItemQuantityType getAvailable(){
        return get(ItemQuantityType.class,"available");
    }
    public void setAvailable(ItemQuantityType available){
        set("available",available.getInner());
    }

    public ItemQuantityType getMaximum(){
        return get(ItemQuantityType.class,"maximum");
    }
    public void setMaximum(ItemQuantityType maximum){
        set("maximum",maximum.getInner());
    }

    public ItemQuantityType getMinimum(){
        return get(ItemQuantityType.class,"minimum");
    }
    public void setMinimum(ItemQuantityType minimum){
        set("minimum",minimum.getInner());
    }

    public ItemQuantityType getSelected(){
        return get(ItemQuantityType.class,"selected");
    }
    public void setSelected(ItemQuantityType selected){
        set("selected",selected.getInner());
    }
}
