package sg.edu.rp.c346.todolist;

import android.graphics.Movie;

public class ToDoItem {
    private String taskName;
    private String taskDate;

    public ToDoItem(String taskName, String taskDate) {
        this.taskName = taskName;
        this.taskDate = taskDate;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String movieName) {
        this.taskName = movieName;
    }

    public String getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(String taskDate) {
        this.taskDate = taskDate;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "TaskName='" + taskName +'\'' +
                ", TaskDate='" + taskDate +'\'' +
                '}';

    }
}
