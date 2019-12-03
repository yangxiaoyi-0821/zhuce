package com.cn.Entity;

import java.sql.Time;

public class Donate_Record {
    private int benefactor_id;
    private int article_id;
    private Time time;

    public int getBenefactor_id() {
        return benefactor_id;
    }

    public void setBenefactor_id(int benefactor_id) {
        this.benefactor_id = benefactor_id;
    }

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Donate_Record{" +
                "benefactor_id=" + benefactor_id +
                ", article_id=" + article_id +
                ", time=" + time +
                '}';
    }
}
