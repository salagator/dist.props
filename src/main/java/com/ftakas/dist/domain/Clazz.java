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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Clazz superClazz;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = PropertyDefn.class)
    private Collection<PropertyDefn> propertyDefns;

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

    public Clazz getSuperClazz() {
        return superClazz;
    }

    public void setSuperClazz(Clazz superClazz) {
        this.superClazz = superClazz;
    }

    public Collection<PropertyDefn> getPropertyDefns() {
        return propertyDefns;
    }

    public void setPropertyDefns(Collection<PropertyDefn> propertyDefns) {
        this.propertyDefns = propertyDefns;
    }

}
