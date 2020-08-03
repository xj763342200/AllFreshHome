package com.zl.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class XSs implements Serializable {
    private BigDecimal sId;

    private String name;

    private BigDecimal streetId;

    private static final long serialVersionUID = 1L;

    public BigDecimal getsId() {
        return sId;
    }

    public void setsId(BigDecimal sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getStreetId() {
        return streetId;
    }

    public void setStreetId(BigDecimal streetId) {
        this.streetId = streetId;
    }
}