package com.xebia.okr.okrapplication;

import javax.persistence.Entity;

@Entity
public class KeyResult {

    // Persistent Fields
    private int id;
    private int objective_id;
    private String name;
    private String comment;
    private float start_value;
    private float target_value;
    private float current_value;
    private int confidence;

    // Accessor and setter Methods
    public int getObjective_id() {
        return objective_id;
    }

    public void setObjective_id(int objective_id) {
        this.objective_id = objective_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public float getStart_value() {
        return start_value;
    }

    public void setStart_value(float start_value) {
        this.start_value = start_value;
    }

    public float getTarget_value() {
        return target_value;
    }

    public void setTarget_value(float target_value) {
        this.target_value = target_value;
    }

    public float getCurrent_value() {
        return current_value;
    }

    public void setCurrent_value(float current_value) {
        this.current_value = current_value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getConfidence() {
        return confidence;
    }

    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }


    @Override
    public String toString() {
        return "KeyResult{" +
                "id=" + id +
                ", objective_id=" + objective_id +
                ", name='" + name + '\'' +
                ", comment='" + comment + '\'' +
                ", start_value=" + start_value +
                ", target_value=" + target_value +
                ", current_value=" + current_value +
                ", confidence=" + confidence +
                '}';
    }



}
