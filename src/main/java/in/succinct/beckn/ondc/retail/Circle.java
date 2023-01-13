package in.succinct.beckn.ondc.retail;

public class Circle extends in.succinct.beckn.Circle {
    public Circle() { super(); }

    public Scalar getScalarRadius(){
        return get(Scalar.class,"radius");
    }
    public void setScalarRadius(Scalar range){
        set("radius",range.getInner());
    }
}
