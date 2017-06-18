package com.ftakas.dist.domain.property;

import com.ftakas.dist.domain.Clazz;
import com.ftakas.dist.domain.PropertyType;
import com.ftakas.dist.domain.PropertyVal;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OrderColumn;
import java.util.List;

@Entity
public class ClazzPropertyVal extends PropertyVal {
    @ElementCollection(targetClass = Clazz.class)
    @OrderColumn(name = "POSITION")
    private List<Clazz> clazzList;

    @Override
    public PropertyType getPropertyType() {
        return PropertyType.Clazz;
    }

    public List<Clazz> getClazzList() {
        return clazzList;
    }

    public void setClazzList(List<Clazz> clazzList) {
        this.clazzList = clazzList;
    }
}
