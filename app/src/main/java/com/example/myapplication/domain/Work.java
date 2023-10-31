package com.example.myapplication.domain;

import java.util.List;

public class Work {
    private String comment = "";
    private List<String> images_url;
    private String lesson_name;
    private String school;
    private String school_class;
    private String author;

    private String date;

    public Work(String comment, List<String> images_url, String lesson_name, String school, String school_class, String author, String date){
        this.comment = comment;
        this.images_url = images_url;
        this.lesson_name = lesson_name;
        this.school = school;
        this.school_class = school_class;
        this.author = author;
        this.date = date;
    }



    public String getAuthor() {
        return author;
    }

    public List<String> getImages_url() {
        return images_url;
    }

    public String getComment() {
        return comment;
    }

    public String getLesson_name() {
        return lesson_name;
    }

    public String getSchool() {
        return school;
    }

    public String getSchool_class() {
        return school_class;
    }

    public String getDate() {
        return date;
    }
}
