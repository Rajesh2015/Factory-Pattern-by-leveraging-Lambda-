package com.example.factorypattern.lambda.multipleargument;
import java.awt.Color;


public class FactoryPatternDemo {
    private final ShapeFactory shapeFactory;

    public FactoryPatternDemo(ShapeFactory shapeFactory) {
        this.shapeFactory = shapeFactory;
    }

    public static void main( String[] args) {
        // first: static factory method example
        ShapeFactory.createFactory( ShapeFactory.ShapeType.CIRCLE).create( Color.RED, 2).draw();

        // second: inject factory into application and use later on
        ShapeFactory factory = ShapeFactory.createFactory( ShapeFactory.ShapeType.RECTANGLE);

        FactoryPatternDemo demoApp = new FactoryPatternDemo( factory);
        demoApp.drawShape( Color.BLUE, 3);
    }

    private void drawShape(Color colour, int thickness) {
        shapeFactory.create( colour, thickness).draw();
    }


}