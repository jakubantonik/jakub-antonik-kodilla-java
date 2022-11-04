package com.kodilla.testing.shape;

import java.util.Objects;

import static java.lang.Math.pow;

public class Circle implements Shape {
    private String name = "Circle";
    private double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && Objects.equals(name, circle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, radius);
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        double field = pow(radius, 2) * Math.PI;
        return field;
    }

}
