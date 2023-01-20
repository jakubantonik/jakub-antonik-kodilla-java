package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    private String taskName;
    private String where;
    private String using;
    private boolean executedTask;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.executedTask = false;
    }
    @Override
    public void executeTask(){
        executedTask = true;
    }
    @Override
    public String getTaskName(){
        return taskName;
    }
    @Override
    public boolean isTaskExecuted(){
        return executedTask;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }
}
