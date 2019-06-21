package com.pojo;

import java.util.Date;

public class Work {
    private Integer id;

    private Integer parentId;

    private String name;

    private Date createAt;

    private String updateBy;

    private Date updateAt;

    private String createBy;

    private String img;

    private String introduce;

    public Work(Integer id, Integer parentId, String name, Date createAt, String updateBy, Date updateAt, String createBy, String img, String introduce) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.createAt = createAt;
        this.updateBy = updateBy;
        this.updateAt = updateAt;
        this.createBy = createBy;
        this.img = img;
        this.introduce = introduce;
    }

    public Work() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    @Override
    public String toString() {
        return "Work{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                ", createAt=" + createAt +
                ", updateBy='" + updateBy + '\'' +
                ", updateAt=" + updateAt +
                ", createBy='" + createBy + '\'' +
                ", img='" + img + '\'' +
                ", introduce='" + introduce + '\'' +
                '}';
    }
}