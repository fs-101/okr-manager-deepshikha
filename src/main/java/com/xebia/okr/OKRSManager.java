package com.xebia.okr.okrapplication;

import javax.persistence.Entity;

@Entity
public class OKRSManager {
    private int id;
    private int objectiveId;
    private String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getObjectiveId() {
        return objectiveId;
    }

    public void setObjectiveId(int objectiveId) {
        this.objectiveId = objectiveId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "OKRSManager{" +
                "id=" + id +
                ", objectiveId=" + objectiveId +
                ", comment='" + comment + '\'' +
                '}';
    }
}
