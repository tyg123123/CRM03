package com.zking.crm.model;

public class Yh {
    private Integer yhbh;

    private String yhzh;

    private String yhmm;

    public Yh(Integer yhbh, String yhzh, String yhmm) {
        this.yhbh = yhbh;
        this.yhzh = yhzh;
        this.yhmm = yhmm;
    }

    public Yh() {
        super();
    }

    public Integer getYhbh() {
        return yhbh;
    }

    public void setYhbh(Integer yhbh) {
        this.yhbh = yhbh;
    }

    public String getYhzh() {
        return yhzh;
    }

    public void setYhzh(String yhzh) {
        this.yhzh = yhzh;
    }

    public String getYhmm() {
        return yhmm;
    }

    public void setYhmm(String yhmm) {
        this.yhmm = yhmm;
    }
}