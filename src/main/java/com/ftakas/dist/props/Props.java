package com.ftakas.dist.props;

import com.ftakas.dist.domain.Clazz;
import com.ftakas.dist.domain.PropertyDefn;
import com.ftakas.dist.domain.PropertyVal;
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

        List<PropertyDefn> newClazzPropertyDefns = new ArrayList<>();
        newClazzPropertyDefns.add(namePropertyDefn);
        newClazzPropertyDefns.addAll(Arrays.asList(propertyDefns));

        StringPropertyVal namePropertyVal = new StringPropertyVal();
        namePropertyVal.setDirty(false);
        namePropertyVal.setInConflict(false);
        namePropertyVal.setPropertyDefn(namePropertyDefn);
        namePropertyVal.setStringList(Arrays.asList(new String[]{ name }));

        List<PropertyVal> newClazzProperties = new ArrayList<>();
        newClazzProperties.add(namePropertyVal);

        newClazz.setProperties(newClazzProperties);
        newClazz.setPropertyDefns(newClazzPropertyDefns);

        return newClazz;
    }
}
