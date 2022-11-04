package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private String name = "Square";
    private double length;

    public Square(String name, double length) {
        this.name = name;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.length, length) == 0 && Objects.equals(name, square.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, length);
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        double field = length*length;
        return field;
    }

}
