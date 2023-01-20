package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean executedTask;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }
}
