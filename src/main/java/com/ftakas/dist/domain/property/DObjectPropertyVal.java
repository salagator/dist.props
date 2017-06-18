package com.ftakas.dist.domain.property;

import com.ftakas.dist.domain.DObject;
import com.ftakas.dist.domain.PropertyType;
import com.ftakas.dist.domain.PropertyVal;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OrderColumn;
import java.util.List;

@Entity
public class DObjectPropertyVal extends PropertyVal {
    @ElementCollection(targetClass = com.ftakas.dist.domain.DObject.class)
    @OrderColumn(name = "POSITION")
    private List<com.ftakas.dist.domain.DObject> dObjectList;

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.DObject;
    }

    public List<DObject> getDObjectList() {
        return dObjectList;
    }

    public void setDObjectList(List<DObject> dObjectList) {
        this.dObjectList = dObjectList;
    }
}
