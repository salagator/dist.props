package com.ftakas.dist.domain;

import javax.persistence.*;

@Entity
public class PropertyDefn {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Version
    private long version;

    private String name;

    private PropertyType propertyType;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private PropertyVal defaultVal;

    private boolean array;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public PropertyVal getDefaultVal() {
        return defaultVal;
    }

    public void setDefaultVal(PropertyVal defaultVal) {
        this.defaultVal = defaultVal;
    }

    public boolean isArray() {
        return array;
    }

    public void setArray(boolean array) {
        this.array = array;
    }
}
