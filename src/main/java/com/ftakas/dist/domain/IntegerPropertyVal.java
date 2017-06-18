package com.ftakas.dist.domain;

import javax.persistence.Entity;

@Entity
public class IntegerPropertyVal extends PropertyVal {
    private Long[] longArray;

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.Integer;
    }

    public void setLongArray(Long[] longArray) {
        this.longArray = longArray;
    }

    public Long[] getLongArray() {
        return longArray;
    }
}
