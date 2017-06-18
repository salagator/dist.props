package com.ftakas.dist.domain;

import javax.persistence.Entity;

@Entity
public class BooleanPropertyVal extends PropertyVal {
    private Boolean[] booleanArray;

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.Boolean;
    }

    public Boolean[] getBooleanArray() {
        return booleanArray;
    }

    public void setBooleanArray(Boolean[] booleanArray) {
        this.booleanArray = booleanArray;
    }
}
