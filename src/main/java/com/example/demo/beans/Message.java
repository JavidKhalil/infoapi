package com.example.demo.beans;

import java.io.Serializable;
import java.util.Date;
import org.springframework.data.annotation.Id;

public class Message implements Serializable {

    @Id
    private String id;
    private String title;
    private String body;
    private Date created = new Date();

    public Message(){

    }

    public Message(String title, String body){
        this.title = title;
        this.body = body;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", created=" + created +
                '}';
    }
}
