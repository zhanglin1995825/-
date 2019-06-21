package com.pojo;

import java.util.Date;

public class Production {
    private Integer id;

    private String name;

    private Integer parentId;

    private String state;

    private String url;

    private String img;

    private String video;

    private String introduce;

    private String createAt;

    private String createBy;

    private Date updateAt;

    private Date updateBy;

    public Production(Integer id, String name, Integer parentId, String state, String url, String img, String video, String introduce, String createAt, String createBy, Date updateAt, Date updateBy) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.state = state;
        this.url = url;
        this.img = img;
        this.video = video;
        this.introduce = introduce;
        this.createAt = createAt;
        this.createBy = createBy;
        this.updateAt = updateAt;
        this.updateBy = updateBy;
    }

    public Production() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Date updateBy) {
        this.updateBy = updateBy;
    }
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name == null ? null : name.trim();
//    }
//
//    public Integer getParentId() {
//        return parentId;
//    }
//
//    public void setParentId(Integer parentId) {
//        this.parentId = parentId;
//    }
//
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state == null ? null : state.trim();
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url == null ? null : url.trim();
//    }
//
//    public String getImg() {
//        return img;
//    }
//
//    public void setImg(String img) {
//        this.img = img == null ? null : img.trim();
//    }
//
//    public String getVideo() {
//        return video;
//    }
//
//    public void setVideo(String video) {
//        this.video = video == null ? null : video.trim();
//    }
//
//    public String getIntroduce() {
//        return introduce;
//    }
//
//    public void setIntroduce(String introduce) {
//        this.introduce = introduce == null ? null : introduce.trim();
//    }
//
//    public String getCreateAt() {
//        return createAt;
//    }
//
//    public void setCreateAt(String createAt) {
//        this.createAt = createAt == null ? null : createAt.trim();
//    }
//
//    public String getCreateBy() {
//        return createBy;
//    }
//
//    public void setCreateBy(String createBy) {
//        this.createBy = createBy == null ? null : createBy.trim();
//    }
//
//    public Date getUpdateAt() {
//        return updateAt;
//    }
//
//    public void setUpdateAt(Date updateAt) {
//        this.updateAt = updateAt;
//    }
//
//    public Date getUpdateBy() {
//        return updateBy;
//    }
//
//    public void setUpdateBy(Date updateBy) {
//        this.updateBy = updateBy;
//    }

    @Override
    public String toString() {
        return "Production{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", state='" + state + '\'' +
                ", url='" + url + '\'' +
                ", img='" + img + '\'' +
                ", video='" + video + '\'' +
                ", introduce='" + introduce + '\'' +
                ", createAt='" + createAt + '\'' +
                ", createBy='" + createBy + '\'' +
                ", updateAt=" + updateAt +
                ", updateBy=" + updateBy +
                '}';
    }
}