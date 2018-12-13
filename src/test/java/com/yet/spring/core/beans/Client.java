package com.yet.spring.core.beans;

public class Client {
    String id;
    String fullname;

    public void setId(String id){
       this.id = id;
    }

    public void setFullname(String fullname){
       this.fullname = fullname;
    }

    public String getId(){
        return id;
    }

    public String getFullname(){
        return fullname;
    }


}
