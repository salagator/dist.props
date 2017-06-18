package com.ftakas.dist.domain.property;

import com.ftakas.dist.domain.PropertyType;
import com.ftakas.dist.domain.PropertyVal;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OrderColumn;
import java.util.List;

@Entity
public class FloatingPointPropertyVal extends PropertyVal {
    @ElementCollection(targetClass = Double.class)
    @OrderColumn(name = "POSITION")
    private List<Double> doubleList;

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.FloatingPoint;
    }

    public List<Double> getDoubleList() {
        return doubleList;
    }

    public void setDoubleList(List<Double> doubleList) {
        this.doubleList = doubleList;
    }
}
