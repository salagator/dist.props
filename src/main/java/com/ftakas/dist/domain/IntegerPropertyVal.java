package com.ftakas.dist.domain;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OrderColumn;
import java.util.List;

@Entity
public class IntegerPropertyVal extends PropertyVal {
    @ElementCollection(targetClass = Long.class)
    @OrderColumn(name = "POSITION")
    private List<Long> longList;

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.Integer;
    }

    public void setLongList(List<Long> longList) {
        this.longList = longList;
    }

    public List<Long> getLongList() {
        return longList;
    }
}
