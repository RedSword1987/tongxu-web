package com.tongxuweb.domain.generate;

import java.io.Serializable;
import java.util.Date;

public class PUserProperty implements Serializable {

    //id
    private Long id;

    private Long userId;

    //邮箱
    private String email;

    //1:女 2:男
    private Integer gender;

    //照片
    private String photo;

    private Date recentChangeLoginPass;

    private Date recentChangePayPass;

    private Date recentChangeGesturePass;

    //创建人
    private Long createdBy;

    //修改人
    private Long updatedBy;

    //创建时间
    private Date createdAt;

    //修改时间
    private Date updatedAt;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Date getRecentChangeLoginPass() {
        return recentChangeLoginPass;
    }

    public void setRecentChangeLoginPass(Date recentChangeLoginPass) {
        this.recentChangeLoginPass = recentChangeLoginPass;
    }

    public Date getRecentChangePayPass() {
        return recentChangePayPass;
    }

    public void setRecentChangePayPass(Date recentChangePayPass) {
        this.recentChangePayPass = recentChangePayPass;
    }

    public Date getRecentChangeGesturePass() {
        return recentChangeGesturePass;
    }

    public void setRecentChangeGesturePass(Date recentChangeGesturePass) {
        this.recentChangeGesturePass = recentChangeGesturePass;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}