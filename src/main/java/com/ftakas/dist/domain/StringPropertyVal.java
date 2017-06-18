package com.ftakas.dist.domain;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OrderColumn;
import java.util.List;

@Entity
public class StringPropertyVal extends PropertyVal {
    @ElementCollection(targetClass = String.class)
    @OrderColumn(name = "POSITION")
    private List<String> stringList;

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.String;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }
}
