package com.zl.domain;

import java.io.Serializable;

public class XCategory implements Serializable {
    private Short categoryId;

    private String name;

    private Short parentId;

    private static final long serialVersionUID = 1L;

    public Short getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Short categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getParentId() {
        return parentId;
    }

    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }
}