package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class post {

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();

    public post() {

    }

    public post(Date moment, String title, String content, Integer likes){
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

}