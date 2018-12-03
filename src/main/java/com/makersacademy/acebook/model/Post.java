package com.makersacademy.acebook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

import lombok.Data;

@Data
@Entity
@Table(name = "POSTS")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private String name;

    private Post() {}

    public Post(String content) {
        System.out.printf("BEEP!");
        this.content = content;
        this.name = "TESTNAME";
    }

    public String getContent() {
        return this.content;
    }
}
