package com.sbolbin.enterprice.domain.model;

import java.util.List;

/**
 * Created by sbolbin on 06.04.2014.
 */
public class User {

    private Long id;
    private String login;
    private String name;
    private List<Permission> permissions;

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions.clear();
        if(permissions != null) {
            this.permissions.addAll(permissions);
        }
    }
}
