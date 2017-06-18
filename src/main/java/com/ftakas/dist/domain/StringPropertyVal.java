package com.ftakas.dist.domain;

import javax.persistence.Entity;

@Entity
public class StringPropertyVal extends PropertyVal {
    private String[] stringArray;

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.String;
    }

    public String[] getStringArray() {
        return stringArray;
    }

    public void setStringArray(String[] stringArray) {
        this.stringArray = stringArray;
    }
}
