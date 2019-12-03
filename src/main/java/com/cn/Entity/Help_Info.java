package com.cn.Entity;

import java.sql.Time;

public class Help_Info {
    private int help_info_id;
    private Time time;
    private String need;

    public int getHelp_info_id() {
        return help_info_id;
    }

    public void setHelp_info_id(int help_info_id) {
        this.help_info_id = help_info_id;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNeed() {
        return need;
    }

    public void setNeed(String need) {
        this.need = need;
    }

    @Override
    public String toString() {
        return "Help_Info{" +
                "help_info_id=" + help_info_id +
                ", time=" + time +
                ", need='" + need + '\'' +
                '}';
    }
}
