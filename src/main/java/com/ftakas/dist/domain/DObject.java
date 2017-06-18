package com.ftakas.dist.domain;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class DObject {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Version
    private long version;

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

    public Collection<PropertyVal> getProperties() {
        return properties;
    }

    public void setProperties(Collection<PropertyVal> properties) {
        this.properties = properties;
    }
}
