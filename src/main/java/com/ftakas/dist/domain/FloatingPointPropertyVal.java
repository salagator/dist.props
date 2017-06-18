package com.ftakas.dist.domain;

import javax.persistence.Entity;

@Entity
public class FloatingPointPropertyVal extends PropertyVal {
    private Double[] doubleArray;

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.FloatingPoint;
    }

    public Double[] getDoubleArray() {
        return doubleArray;
    }

    public void setDoubleArray(Double[] doubleArray) {
        this.doubleArray = doubleArray;
    }
}
