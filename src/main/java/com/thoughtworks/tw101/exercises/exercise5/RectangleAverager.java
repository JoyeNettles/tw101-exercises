package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {
    private Rectangle[] rectangles;

    public float averageArea(Rectangle[] rectangles) {
        this.rectangles = rectangles;
        float average = 0;

        for(Rectangle rectangle: rectangles){
            average += rectangle.area();
        }

        average = average/rectangles.length; // Calculates average of alll rectangles

        return average;
    }
}
