package in.succinct.beckn.ondc.retail;

public class Rating extends in.succinct.beckn.Rating {
    public Rating() {super();}

    public FeedbackForm getFeedbackForm(){
        return get(FeedbackForm.class,"feedback_form");
    }
    public void setFeedbackForm(FeedbackForm feedback_form){
        set("feedback_form",feedback_form.getInner());
    }

    public String getFeedbackId(){
        return get("feedback_id");
    }
    public void setFeedbackId(String feedback_id){
        set("feedback_id",feedback_id);
    }
}
