package application;

import entities.Comment;

public class Program {
    public stati void main(String[] args) throws ParseExcpetion {

        SimpleDateFormat sdf = new SimpleDateFromat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);
    }
}