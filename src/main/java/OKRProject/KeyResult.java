package OKRProject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class KeyResult {
    @Id
    private int id;
    private int obj_id;
    private String kr_name;
    private String  kr_desc;
    private double target;
    private double status;
    private double confidence;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getObj_id() {
        return obj_id;
    }

    public void setObj_id(int obj_id) {
        this.obj_id = obj_id;
    }

    public String getKr_name() {
        return kr_name;
    }

    public void setKr_name(String kr_name) {
        this.kr_name = kr_name;
    }

    public String getKr_desc() {
        return kr_desc;
    }

    public void setKr_desc(String kr_desc) {
        this.kr_desc = kr_desc;
    }

    public double getTarget() {
        return target;
    }

    public void setTarget(double target) {
        this.target = target;
    }

    public double getStatus() {
        return status;
    }

    public void setStatus(double status) {
        this.status = status;
    }

    public double getConfidence() {
        return confidence;
    }

    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }

    @Override
    public String toString() {
        return "KeyResult{" +
                "id=" + id +
                ", obj_id=" + obj_id +
                ", kr_name='" + kr_name + '\'' +
                ", kr_desc='" + kr_desc + '\'' +
                ", target=" + target +
                ", status=" + status +
                ", confidence=" + confidence +
                '}';
    }
}
