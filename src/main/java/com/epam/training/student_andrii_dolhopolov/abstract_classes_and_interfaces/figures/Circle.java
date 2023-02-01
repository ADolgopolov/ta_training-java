package com.epam.training.student_andrii_dolhopolov.abstract_classes_and_interfaces.figures;

class Circle extends Figure {
    private final Point center;
    private final double radius;
    public Circle(Point circleCenter , double cirlcleRadius){
        this.center = circleCenter;
        this.radius = cirlcleRadius;
    }

    @Override
    public double area() {
        return (Math.PI * this.radius * this.radius);
    }

    @Override
    public String pointsToString() {
        return String.format("(%s,%s)", this.center.getX(), this.center.getY());
    }

    @Override
    public Point leftmostPoint() {
        return new Point((this.center.getX() - this.radius), this.center.getY());
    }

    @Override
    public String toString() {
        return String.format("Circle[(%s,%s)%s]", this.center.getX(), this.center.getY(), this.radius);
    }
}
