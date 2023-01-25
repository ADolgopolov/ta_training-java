package com.epam.training.student_andrii_dolhopolov.classes.exercise2_segments;

//import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

class Segment {

    private final Point start, end;

    public Segment(Point start, Point end) {

        if (start.getX() == end.getX() && start.getY() == end.getY()){
            throw new IllegalArgumentException();
        }
        this.start = start;
        this.end = end;
    }

    double length() {
        double dist;
        double dx = this.end.getX() - this.start.getX();
        double dy = this.end.getY() - this.start.getY();

        dx = pow(dx, 2);
        dy = pow(dy, 2);

        dist = sqrt(dx + dy);

        return dist;

    }

    Point middle() {

        double x = (this.end.getX() + this.start.getX()) / 2.0;
        double y = (this.end.getY() + this.start.getY()) / 2.0;

        return new Point( x, y );

    }

    Point intersection(Segment another) {

        double adx = this.end.getX() - this.start.getX();
        double ady = this.end.getY() - this.start.getY();

        double bdx = another.end.getX() - another.start.getX();
        double bdy = another.end.getY() - another.start.getY();

        double d = bdy * adx - bdx * ady;

        if (d == 0.0) { return null; }

        double t = (bdx * (this.start.getY() - another.start.getY()) + bdy * (another.start.getX() - this.start.getX())) / d;

        double x = this.start.getX() + adx * t;
        double y = this.start.getY() + ady * t;

        double u = (x - another.start.getX()) / (another.end.getX() - another.start.getX());

        if (( t >= 0.0 && t <= 1.0 ) && ( u >= 0.0 && u <= 1.0 )) {
            return new Point(x, y);
        } else return null;
    }

}

