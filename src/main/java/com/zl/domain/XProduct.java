package com.zl.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class XProduct implements Serializable {
    private Short proId;

    private String proName;

    private String proPlace;

    private String proStyle;

    private String proLevel;

    private Short proCount;

    private BigDecimal houseAsk;

    private BigDecimal proPrice;

    private String proHouse;

    private String proNowgo;

    private String proSupply;

    private String supplyPhone;

    private static final long serialVersionUID = 1L;

    public Short getProId() {
        return proId;
    }

    public void setProId(Short proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProPlace() {
        return proPlace;
    }

    public void setProPlace(String proPlace) {
        this.proPlace = proPlace;
    }

    public String getProStyle() {
        return proStyle;
    }

    public void setProStyle(String proStyle) {
        this.proStyle = proStyle;
    }

    public String getProLevel() {
        return proLevel;
    }

    public void setProLevel(String proLevel) {
        this.proLevel = proLevel;
    }

    public Short getProCount() {
        return proCount;
    }

    public void setProCount(Short proCount) {
        this.proCount = proCount;
    }

    public BigDecimal getHouseAsk() {
        return houseAsk;
    }

    public void setHouseAsk(BigDecimal houseAsk) {
        this.houseAsk = houseAsk;
    }

    public BigDecimal getProPrice() {
        return proPrice;
    }

    public void setProPrice(BigDecimal proPrice) {
        this.proPrice = proPrice;
    }

    public String getProHouse() {
        return proHouse;
    }

    public void setProHouse(String proHouse) {
        this.proHouse = proHouse;
    }

    public String getProNowgo() {
        return proNowgo;
    }

    public void setProNowgo(String proNowgo) {
        this.proNowgo = proNowgo;
    }

    public String getProSupply() {
        return proSupply;
    }

    public void setProSupply(String proSupply) {
        this.proSupply = proSupply;
    }

    public String getSupplyPhone() {
        return supplyPhone;
    }

    public void setSupplyPhone(String supplyPhone) {
        this.supplyPhone = supplyPhone;
    }
}