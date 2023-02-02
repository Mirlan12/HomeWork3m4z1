package com.example.homework3m4z;

import java.io.Serializable;

public class Game implements Serializable {

    private String name;
    private String icon;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Game(String name, String icon, String description) {
        this.name = name;
        this.icon = icon;
        this.description = description;
    }

}
