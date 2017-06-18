package com.ftakas.dist.domain;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OrderColumn;
import java.util.List;

@Entity
public class PropertyDefnPropertyVal extends PropertyVal {
    @ElementCollection(targetClass = PropertyDefn.class)
    @OrderColumn(name = "POSITION")
    private List<PropertyDefn> propertyDefnList;

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.PropertyDefn;
    }

    public List<PropertyDefn> getPropertyDefnList() {
        return propertyDefnList;
    }

    public void setPropertyDefnList(List<PropertyDefn> propertyDefnList) {
        this.propertyDefnList = propertyDefnList;
    }
}
