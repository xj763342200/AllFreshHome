package com.zl.domain;

import java.io.Serializable;

public class XUser implements Serializable {
    private Short userId;

    private String username;

    private String userpwd;

    private String realname;

    private String idCard;

    private String idPhoto;

    private String address;

    private String phone;

    private String email;

    private String telephone;

    private Short purchasingId;

    private Short supplyId;

    private static final long serialVersionUID = 1L;

    public Short getUserId() {
        return userId;
    }

    public void setUserId(Short userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdPhoto() {
        return idPhoto;
    }

    public void setIdPhoto(String idPhoto) {
        this.idPhoto = idPhoto;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Short getPurchasingId() {
        return purchasingId;
    }

    public void setPurchasingId(Short purchasingId) {
        this.purchasingId = purchasingId;
    }

    public Short getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(Short supplyId) {
        this.supplyId = supplyId;
    }
}