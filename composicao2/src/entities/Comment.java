package entities;

public class Comment {

    private String text;

    public Comment() {
    }

    public Coomment(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

}