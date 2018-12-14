package core.beans;

import java.util.Date;

public class Event {
    int id;
    String msg;
    Date date;

    public void setId(int id){
       this.id = id;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }

    public void setDate(Date date){
        this.date = date;
    }

    @Override
    public String toString(){

    };


}
