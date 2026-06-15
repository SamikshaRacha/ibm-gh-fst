package fst;

import Book;

public class MyBook extends Book {

    public void setTitle(String title) {
        this.title = title;
    }

    public static void main(String[] args) {
        String title = "Hover Car Racer";

        Book newNovel = new MyBook();
        newNovel.setTitle(title);

        System.out.println("The title is: " + newNovel.getTitle());
    }
}