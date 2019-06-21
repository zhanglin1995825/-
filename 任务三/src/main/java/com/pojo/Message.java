package com.pojo;

import java.util.Date;

public class Message {
    private Integer id;

    private Integer state;

    private String content;

    private Date createat;

    private Integer nickip;

    private Date updateat;

    private Integer workid;

    private Integer type;

    private Integer replyid;

    public Message(Integer id, Integer state, String content, Date createat, Integer nickip, Date updateat, Integer workid, Integer type, Integer replyid) {
        this.id = id;
        this.state = state;
        this.content = content;
        this.createat = createat;
        this.nickip = nickip;
        this.updateat = updateat;
        this.workid = workid;
        this.type = type;
        this.replyid = replyid;
    }

    public Message() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateat() {
        return createat;
    }

    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    public Integer getNickip() {
        return nickip;
    }

    public void setNickip(Integer nickip) {
        this.nickip = nickip;
    }

    public Date getUpdateat() {
        return updateat;
    }

    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    public Integer getWorkid() {
        return workid;
    }

    public void setWorkid(Integer workid) {
        this.workid = workid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getReplyid() {
        return replyid;
    }

    public void setReplyid(Integer replyid) {
        this.replyid = replyid;
    }
}