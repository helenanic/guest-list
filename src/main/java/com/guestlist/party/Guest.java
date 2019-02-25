package com.guestlist.party;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Guest implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Integer companionsNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCompanionsNumber() {
        return companionsNumber;
    }

    public void setCompanionsNumber(Integer companionsNumber) {
        this.companionsNumber = companionsNumber;
    }
}
