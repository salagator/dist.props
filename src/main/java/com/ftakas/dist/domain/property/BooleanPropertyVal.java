package com.ftakas.dist.domain.property;

import com.ftakas.dist.domain.PropertyType;
import com.ftakas.dist.domain.PropertyVal;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OrderColumn;
import java.util.List;

@Entity
public class BooleanPropertyVal extends PropertyVal {
    @ElementCollection(targetClass = Boolean.class)
    @OrderColumn(name = "POSITION")
    private List<Boolean> booleanList;

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.Boolean;
    }

    public List<Boolean> getBooleanList() {
        return booleanList;
    }

    public void setBooleanList(List<Boolean> booleanList) {
        this.booleanList = booleanList;
    }
}
