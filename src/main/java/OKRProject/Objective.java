package OKRProject;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Objective {
    @Id
    private int id;
    private int plan_id;
    private String obj_name;
    private String obj_desc;
    private Date start_time;
    private Date end_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(int plan_id) {
        this.plan_id = plan_id;
    }

    public String getObj_name() {
        return obj_name;
    }

    public void setObj_name(String obj_name) {
        this.obj_name = obj_name;
    }

    public String getObj_desc() {
        return obj_desc;
    }

    public void setObj_desc(String obj_desc) {
        this.obj_desc = obj_desc;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    @Override
    public String toString() {
        return "Objective{" +
                "id=" + id +
                ", plan_id=" + plan_id +
                ", obj_name='" + obj_name + '\'' +
                ", obj_desc='" + obj_desc + '\'' +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                '}';
    }
}
