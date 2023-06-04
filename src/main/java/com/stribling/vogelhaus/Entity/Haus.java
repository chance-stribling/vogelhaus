package com.stribling.vogelhaus.Entity;

import com.stribling.vogelhaus.Model.HausModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Haus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;

    public Haus() {
    }

    public Haus(HausModel haus) {
        this.id = haus.getId();
        this.name = haus.getName();
        this.address = haus.getAddress();
    }

    public Long getId() {
        return id;
    }

    public void setId(HausModel haus) {
        this.id = haus.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(HausModel haus) {
        this.name = haus.getName();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(HausModel haus) {
        this.address = haus.getAddress();
    }
}
