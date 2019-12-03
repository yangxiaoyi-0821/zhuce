package com.cn.Entity;

import java.sql.Time;

public class Check {
    private int sender_userid;
    private Time time;
    private String content;

    public int getSender_userid() {
        return sender_userid;
    }

    public void setSender_userid(int sender_userid) {
        this.sender_userid = sender_userid;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Check{" +
                "sender_userid=" + sender_userid +
                ", time=" + time +
                ", content='" + content + '\'' +
                '}';
    }
}
