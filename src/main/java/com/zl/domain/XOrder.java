package com.zl.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class XOrder implements Serializable {
    private Long orderId;

    private String proName;

    private String proStyle;

    private BigDecimal proPrice;

    private Long userId;

    private BigDecimal orderCount;

    private BigDecimal totalPrice;

    private Short status;

    private String purcheser;

    private Long orderNo;

    private Date orderTime;

    private String contactPhone;

    private String address;

    private static final long serialVersionUID = 1L;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProStyle() {
        return proStyle;
    }

    public void setProStyle(String proStyle) {
        this.proStyle = proStyle;
    }

    public BigDecimal getProPrice() {
        return proPrice;
    }

    public void setProPrice(BigDecimal proPrice) {
        this.proPrice = proPrice;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(BigDecimal orderCount) {
        this.orderCount = orderCount;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getPurcheser() {
        return purcheser;
    }

    public void setPurcheser(String purcheser) {
        this.purcheser = purcheser;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}