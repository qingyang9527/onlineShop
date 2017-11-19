package com.hm.onlineshop.bean;

import java.util.Date;

/**
 * Created by H&M on 2017/11/12 17:15:05
 */

public class HotBean {
    //热卖id
    private int id;
    //图片路径
    private String imgPath;
    //热卖标题
    private String title;
    //内容
    private String text;
    //热卖描述
    private String description;
    //日期
    private Date date;


    public HotBean(int id, String imgPath, String title, String text, String description, Date date) {
        this.id=id;

        this.imgPath = imgPath;
        this.title = title;
        this.text = text;
        this.description = description;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
