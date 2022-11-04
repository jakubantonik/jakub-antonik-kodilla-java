package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {


    @DisplayName("Test sprawdzający dodawanie figury")
    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle("Circle", 3);

        //When
        shapeCollector.addFigure(shape);

        //Then
        Assertions.assertEquals(1, shapeCollector.getShapeCollection().size());

    }
    @DisplayName("Test sprawdzający usuwanie figury")
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle("Circle", 3);
        shapeCollector.addFigure(shape);

        //When
        shapeCollector.removeFigure(shape);

        //Then
        Assertions.assertEquals(0,shapeCollector.getShapeCollection().size());

    }
    @DisplayName("Test sprawdzający pobieranie figury")
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle("Circle", 3);
        shapeCollector.addFigure(shape);

        //When
        Shape shapeResult = shapeCollector.getFigure(0);

        //Then
        Assertions.assertEquals(shape, shapeResult);

    }
    @DisplayName("Test sprawdzający wyświetlanie figury")
    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle("Circle", 3);
        shapeCollector.addFigure(shape);
        ArrayList<Shape> figureList = new ArrayList<>();
        figureList.add(shape);

        //When
        ArrayList<Shape> figureListResult = shapeCollector.getShapeCollection();

        //Then
        Assertions.assertEquals(figureList, figureListResult);

    }

}
