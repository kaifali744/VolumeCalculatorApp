package com.example.volumecalculatorapp;

public class Shape {
    private int shapeImg;
    private String shapeName;
    public Shape(int shapeImg, String shapeName){
        this.shapeImg = shapeImg;
        this.shapeName = shapeName;
    }

    public int getShapeImg() {
        return shapeImg;
    }

    public String getShapeName() {
        return shapeName;
    }
}
