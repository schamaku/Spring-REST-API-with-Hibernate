package io.nidhi.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@NamedQueries({
        @NamedQuery(name= "Tasks.findAll", query = "SELECT task from Tasks task ORDER BY task.priority ASC")
})
public class Tasks {

    @Id
    private String id;
    private String title;
    private String description;
    private String priority;
    private String time;
    private String status;

    public Tasks(){
        this.id = UUID.randomUUID().toString();
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    @Column(unique = true)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return "Task{"+
                "id='" + id + '\''+
                "title='" + title + '\''+
                "description='" + description + '\''+
                "priority='" + priority + '\''+
                "time='"+ time + '\'' +
                '}';

    }
}
