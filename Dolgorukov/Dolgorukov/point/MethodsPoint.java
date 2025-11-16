package ru.Dolgorukov.point;

import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Math.abs;

public class MethodsPoint {
    public void task7(Point[] array) {
        Polyline polyline = new Polyline(Arrays.stream(array)
                .filter((Point p) -> p.getY() != (p.getX()))
                .sorted(Comparator.comparingInt(Point::getX))
                .map(p -> new Point(p.getX(), abs(p.getY())))
                .distinct()
                .toArray(Point[]::new));
        System.out.println(polyline.toString());
    }
}
