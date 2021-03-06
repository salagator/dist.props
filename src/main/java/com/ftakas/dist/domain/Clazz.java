package com.ftakas.dist.domain;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Clazz {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Version
    private long version;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = PropertyDefn.class)
    private Collection<PropertyDefn> propertyDefns;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = false,  mappedBy = "DObject")
    private Collection<PropertyVal> properties;

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

    public Collection<PropertyDefn> getPropertyDefns() {
        return propertyDefns;
    }

    public void setPropertyDefns(Collection<PropertyDefn> propertyDefns) {
        this.propertyDefns = propertyDefns;
    }

    public Collection<PropertyVal> getProperties() {
        return properties;
    }

    public void setProperties(Collection<PropertyVal> properties) {
        this.properties = properties;
    }
}
