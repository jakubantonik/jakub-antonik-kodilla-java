package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapeCollection = new ArrayList<>();

    public ArrayList<Shape> getShapeCollection() {
        return shapeCollection;
    }
    public void addFigure(Shape shape){
        shapeCollection.add(shape);
    }
    public void removeFigure(Shape shape){
        shapeCollection.remove(shape);
    }
    public Shape getFigure(int n){
        if(n<shapeCollection.size()){
            return shapeCollection.get(n);
        } else {
            return null;
        }

    }
    public void showFigures(){
        System.out.println(shapeCollection);
    }
}
