package com.ftakas.dist.domain;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class PropertyVal {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private long id;

    @Version
    private long version;

    @ManyToOne(fetch = FetchType.EAGER)
    private PropertyDefn propertyDefn;

    @ManyToOne(fetch = FetchType.EAGER)
    private DObject DObject;

    private boolean inConflict;

    private boolean dirty;

    public abstract PropertyType getPropertyType();

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

    public PropertyDefn getPropertyDefn() {
        return propertyDefn;
    }

    public void setPropertyDefn(PropertyDefn propertyDefn) {
        this.propertyDefn = propertyDefn;
    }

    public boolean isInConflict() {
        return inConflict;
    }

    public void setInConflict(boolean inConflict) {
        this.inConflict = inConflict;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }
}
