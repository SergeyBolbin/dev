package com.sbolbin.enterprice.domain.model;

/**
 * Created by sbolbin on 06.04.2014.
 */
public class Permission {

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
