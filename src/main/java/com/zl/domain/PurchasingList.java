package com.zl.domain;

import java.io.Serializable;
import java.util.Date;

public class PurchasingList implements Serializable {
    private Long purId;

    private Long userId;

    private String proName;

    private String placeAsk;

    private String proStyle;

    private String levelAsk;

    private String houseAsk;

    private String proNowgo;

    private Long maxprice;

    private String purchaseExplian;

    private String payStyle;

    private String invoiceStyle;

    private String getAddress;

    private Date stopTime;

    private String concats;

    private String company;

    private String phone;

    private static final long serialVersionUID = 1L;

    public Long getPurId() {
        return purId;
    }

    public void setPurId(Long purId) {
        this.purId = purId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getPlaceAsk() {
        return placeAsk;
    }

    public void setPlaceAsk(String placeAsk) {
        this.placeAsk = placeAsk;
    }

    public String getProStyle() {
        return proStyle;
    }

    public void setProStyle(String proStyle) {
        this.proStyle = proStyle;
    }

    public String getLevelAsk() {
        return levelAsk;
    }

    public void setLevelAsk(String levelAsk) {
        this.levelAsk = levelAsk;
    }

    public String getHouseAsk() {
        return houseAsk;
    }

    public void setHouseAsk(String houseAsk) {
        this.houseAsk = houseAsk;
    }

    public String getProNowgo() {
        return proNowgo;
    }

    public void setProNowgo(String proNowgo) {
        this.proNowgo = proNowgo;
    }

    public Long getMaxprice() {
        return maxprice;
    }

    public void setMaxprice(Long maxprice) {
        this.maxprice = maxprice;
    }

    public String getPurchaseExplian() {
        return purchaseExplian;
    }

    public void setPurchaseExplian(String purchaseExplian) {
        this.purchaseExplian = purchaseExplian;
    }

    public String getPayStyle() {
        return payStyle;
    }

    public void setPayStyle(String payStyle) {
        this.payStyle = payStyle;
    }

    public String getInvoiceStyle() {
        return invoiceStyle;
    }

    public void setInvoiceStyle(String invoiceStyle) {
        this.invoiceStyle = invoiceStyle;
    }

    public String getGetAddress() {
        return getAddress;
    }

    public void setGetAddress(String getAddress) {
        this.getAddress = getAddress;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public String getConcats() {
        return concats;
    }

    public void setConcats(String concats) {
        this.concats = concats;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}