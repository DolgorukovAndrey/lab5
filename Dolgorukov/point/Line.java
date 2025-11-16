package ru.Dolgorukov.point;

public class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(Point start,Point end){
        this.startPoint = start;
        this.endPoint = end;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    @Override
    public String toString() {
        return "Линия от " + startPoint.toString() + " до " + endPoint.toString();
    }
}

