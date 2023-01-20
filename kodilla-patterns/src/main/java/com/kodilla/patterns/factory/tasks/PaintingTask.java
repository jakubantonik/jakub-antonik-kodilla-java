package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean executedTask;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }
}
