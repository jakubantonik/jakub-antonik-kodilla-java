package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{
    private String name = "Triangle";
    private double length;
    private double height;

    public Triangle(String name, double length, double height) {
        this.name = name;
        this.length = length;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.length, length) == 0 && Double.compare(triangle.height, height) == 0 && Objects.equals(name, triangle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, length, height);
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        double field = (length*height)/2;
        return field;
    }


}
