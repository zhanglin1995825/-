package com.pojo;

import org.springframework.web.multipart.MultipartFile;

public class Banner {
    private Integer id;

    private String url;

    private String img;

    private Long createat;

    private String createby;

    private Long updateat;

    private String updateby;

    private String state;

    //private MultipartFile file;

    public Banner(Integer id, String url, String img, Long createat, String createby, Long updateat, String updateby, String state) {
        this.id = id;
        this.url = url;
        this.img = img;
        this.createat = createat;
        this.createby = createby;
        this.updateat = updateat;
        this.updateby = updateby;
        this.state = state;

    }

    public Banner() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Long getCreateat() {
        return createat;
    }

    public void setCreateat(Long createat) {
        this.createat = createat;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public Long getUpdateat() {
        return updateat;
    }

    public void setUpdateat(Long updateat) {
        this.updateat = updateat;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

//    public MultipartFile getFile() {
//        return file;
//    }
//
//    public void setFile(MultipartFile file) {
//        this.file = file;
//    }

    @Override
    public String toString() {
        return "Banner{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", state=" + state +
                ", createAt=" + createat +
                ", updateAt=" + updateat +
                ", createBy=" + createby +
                ", updateBy=" + updateby +
                '}';
    }
}