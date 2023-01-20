package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskClass){
        return switch (taskClass){
            case SHOPPING -> new ShoppingTask("Fruit", "Apple", 30);
            case PAINTING -> new PaintingTask("Garden", "Green", "Tree");
            case DRIVING -> new DrivingTask("Travel", "Warsaw", "Plane");
            default -> null;
        };
    }
}
