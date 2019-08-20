package com.xebia.okr.okrapplication;

import javax.persistence.Entity;

@Entity
public class Objective {
    private int id;
    private String name;
    private String type;
    private String quarter;
    private int okrsId;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public int getOkrsId() {
        return okrsId;
    }

    public void setOkrsId(int okrsId) {
        this.okrsId = okrsId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Objective{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", quarter='" + quarter + '\'' +
                ", okrsId=" + okrsId +
                ", status='" + status + '\'' +
                '}';
    }
}
