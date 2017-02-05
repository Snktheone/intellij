package com.accedius.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int Id;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public int getId() {
        return Id;
    }

   public Post()
   {

   }
    public Post(String message)
    {
       this.message = message;
    }

}
