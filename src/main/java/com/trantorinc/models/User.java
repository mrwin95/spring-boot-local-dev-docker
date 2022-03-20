package com.trantorinc.models;

public class User {
    
    private Long Id;

    private String name;

    public User(Long id, String name){
        super();
        this.Id = id;
        this.name = name;
    }

    public Long getId(){
        return Id;
    }

    public String getName(){
        return name;
    }
}
