package com.ftakas.dist.domain;

public class PropertyDefn {
    private PropertyType propertyType;
    private boolean array;

    public PropertyDefn(PropertyType propertyType) {
        this(propertyType, false);
    }

    public PropertyDefn(PropertyType propertyType, boolean array) {
        this.propertyType = propertyType;
        this.array = array;
    }

}
