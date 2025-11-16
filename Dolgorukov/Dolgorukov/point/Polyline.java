package ru.Dolgorukov.point;

import java.util.Arrays;

public class Polyline {
    private Point[] polyline;

    public Polyline(Point[] points){
        this.polyline = points;
    }
    @Override
    public String toString() {
        return "Линия " + Arrays.toString(polyline);
    }
}
