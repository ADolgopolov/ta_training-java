package com.epam.training.student_andrii_dolhopolov.abstract_classes_and_interfaces.figures_extra;

class Point {
    private final double x;
    private final double y;

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point)
        {
            Point p = (Point) obj;
            return toClose(p.getX(), this.x) && toClose(p.getY(), this.y);
        }
        return false;
    }
    public static boolean toClose(double a, double b)
    {
        double delta = 0.0001;
        return Math.abs(a - b) < delta;
    }
}
