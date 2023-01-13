package in.succinct.beckn.ondc.retail;

public class Descriptor extends in.succinct.beckn.Descriptor {
    public Descriptor(){
        super();
    }

    public String getAudio(){
        return get("audio");
    }
    public void setAudio(String audio){
        set("audio",audio);
    }

    public String get3dRender(){
        return get("3d_render");
    }
    public void set3dRender(String render3d){
        set("3d_render",render3d);
    }
}
