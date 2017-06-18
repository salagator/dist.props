package com.ftakas.dist.props;

import com.ftakas.dist.domain.Clazz;
import com.ftakas.dist.domain.DObject;
import com.ftakas.dist.domain.PropertyDefn;
import com.ftakas.dist.domain.PropertyVal;
import com.ftakas.dist.domain.property.ClazzPropertyVal;
import com.ftakas.dist.domain.property.StringPropertyVal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Props {
    private Clazz metaClazz;
    private Clazz objectClazz;
    private PropertyDefnService propertyDefnService;

    public Props(Clazz metaClazz, Clazz objectClazz, PropertyDefnService propertyDefnService) {
        this.metaClazz = metaClazz;
        this.objectClazz = objectClazz;
        this.propertyDefnService = propertyDefnService;
    }

    public Clazz getMetaClazz() {
        return metaClazz;
    }

    public Clazz getObjectClazz() {
        return objectClazz;
    }

    public Clazz createNewClazz(String name, Clazz superClazz, PropertyDefn... propertyDefns) {
        Clazz newClazz = new Clazz();
        PropertyDefn namePropertyDefn = propertyDefnService.getPropertyDefn("name");
        PropertyDefn superClazzPropertyDefn = propertyDefnService.getPropertyDefn("super");

        List<PropertyDefn> newClazzPropertyDefns = new ArrayList<>();
        newClazzPropertyDefns.add(namePropertyDefn);
        newClazzPropertyDefns.add(superClazzPropertyDefn);
        newClazzPropertyDefns.addAll(Arrays.asList(propertyDefns));

        StringPropertyVal namePropertyVal = new StringPropertyVal();
        namePropertyVal.setDirty(false);
        namePropertyVal.setInConflict(false);
        namePropertyVal.setPropertyDefn(namePropertyDefn);
        namePropertyVal.setStringList(Arrays.asList(new String[]{ name }));

        ClazzPropertyVal superClazzPropertyVal = new ClazzPropertyVal();
        superClazzPropertyVal.setDirty(false);
        superClazzPropertyVal.setInConflict(false);
        superClazzPropertyVal.setPropertyDefn(superClazzPropertyDefn);
        superClazzPropertyVal.setClazzList(Arrays.asList(new Clazz[]{ superClazz }));

        List<PropertyVal> newClazzProperties = new ArrayList<>();
        newClazzProperties.add(namePropertyVal);
        newClazzProperties.add(superClazzPropertyVal);

        newClazz.setProperties(newClazzProperties);
        newClazz.setPropertyDefns(newClazzPropertyDefns);

        return newClazz;
    }

    public DObject createNewDObject(String name, Clazz clazz, PropertyVal... propertyVals) {
        DObject newDObject = new DObject();
        PropertyDefn namePropertyDefn = propertyDefnService.getPropertyDefn("name");
        PropertyDefn superClazzPropertyDefn = propertyDefnService.getPropertyDefn("super");

        StringPropertyVal namePropertyVal = new StringPropertyVal();
        namePropertyVal.setDirty(false);
        namePropertyVal.setInConflict(false);
        namePropertyVal.setPropertyDefn(namePropertyDefn);
        namePropertyVal.setStringList(Arrays.asList(new String[]{ name }));

        ClazzPropertyVal clazzPropertyVal = new ClazzPropertyVal();
        clazzPropertyVal.setDirty(false);
        clazzPropertyVal.setInConflict(false);
        clazzPropertyVal.setPropertyDefn(superClazzPropertyDefn);
        clazzPropertyVal.setClazzList(Arrays.asList(new Clazz[]{ clazz }));

        List<PropertyVal> newDObjectProperties = new ArrayList<>();
        newDObjectProperties.add(namePropertyVal);
        newDObjectProperties.add(clazzPropertyVal);
        newDObjectProperties.addAll(Arrays.asList(propertyVals));

        newDObject.setProperties(newDObjectProperties);

        return newDObject;
    }
}
