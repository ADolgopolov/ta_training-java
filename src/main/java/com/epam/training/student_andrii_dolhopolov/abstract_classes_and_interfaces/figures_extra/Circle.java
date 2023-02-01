package com.epam.training.student_andrii_dolhopolov.abstract_classes_and_interfaces.figures_extra;

class Circle extends Figure{
    private final Point center;
    private final double radius;
    public Circle(Point circleCenter , double circleRadius){
        if (circleCenter == null) throw new IllegalArgumentException();
        this.center = circleCenter;
        if (  circleRadius > 0) {
            this.radius = circleRadius;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Point centroid() {
        return center;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean isTheSame(Figure figure) {
        if (figure instanceof Circle)
        {
            Circle f = (Circle) figure;
            if (!Point.toClose(this.radius, f.getRadius())) { return false; }
            return this.center.equals(f.getCenter());
        }
        return false;
    }
}
