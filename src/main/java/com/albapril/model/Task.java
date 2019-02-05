package com.albapril.model;

import javax.persistence.*;

/**
 * A class to represent a task item.
 *
 * @author albapril
 */

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long taskId;
    private String taskTitle;
    private String taskDescription;
    private boolean complete;

    public Task() {}

    public Task(String taskTitle, String taskDescription) {
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
    }

    @Override
    public String toString() {
        return String.format(
                "Task[taskId=%d, taskTitle='%s', taskDescription='%s', complete='%b']",
                taskId, taskTitle, taskDescription, complete);
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
        return;
    }

}
