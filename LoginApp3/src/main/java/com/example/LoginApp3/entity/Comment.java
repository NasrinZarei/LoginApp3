package com.example.LoginApp3.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "email",unique=true)
    private String email ;
    @Column(name = "subject")
    private String subject ;
    @Column(name = "comment")
    private String comments;

    public Comment(int id, String name, String email, String subject, String comments) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.comments = comments;
    }

    public Comment() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comment) {
        this.comments = comment;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                ", comment='" + comments + '\'' +
                '}';
    }
}
