package com.kodilla.patterns2.observer.homework;

public class Mentor implements HomeworkObserver {

    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(name + ": New homework in Queue " + taskQueue.getName() + "\n" +
                " (total: " + taskQueue.getObservers().size() + " homework)");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
