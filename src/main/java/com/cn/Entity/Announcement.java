package com.cn.Entity;

import java.sql.Time;

public class Announcement {
    private int anno_id;
    private String title;
    private Time time;
    private String content;

    public int getAnno_id() {
        return anno_id;
    }

    public void setAnno_id(int anno_id) {
        this.anno_id = anno_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        return "Announcement{" +
                "anno_id=" + anno_id +
                ", title='" + title + '\'' +
                ", time=" + time +
                ", content='" + content + '\'' +
                '}';
    }
}
