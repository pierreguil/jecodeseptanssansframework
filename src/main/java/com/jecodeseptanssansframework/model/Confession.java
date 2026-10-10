package com.jecodeseptanssansframework.model;

public class Confession {

    private String title;
    private String content;
    private String author;

    public Confession(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle(){
        return this.title;
    }

    public String getContent(){
        return this.content;
    }

    public String getAuthor(){
        return this.author;
    }
}
