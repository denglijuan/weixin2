package com.zpx.weixin2;

public class s1 {
    private String name;
    private String speak;
    private String time;
    private int id;
    public s1(String name,String speak,String time,int id){
        this.name=name;
        this.speak=speak;
        this.time=time;
        this.id=id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
