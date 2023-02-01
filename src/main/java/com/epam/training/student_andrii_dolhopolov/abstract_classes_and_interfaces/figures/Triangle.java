package com.epam.training.student_andrii_dolhopolov.abstract_classes_and_interfaces.figures;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;
class Triangle extends Figure{

    private final Point a, b, c;
    private final double ab, bc, ac;
    public Triangle(Point p1, Point p2, Point p3) {
        this.a = p1;
        this.b = p2;
        this.c = p3;

        this.ab = length(a,b);
        this.bc = length(b,c);
        this.ac = length(a,c);
    }
    private double length(Point start, Point end) {
        double dist;
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();

        dx = pow(dx, 2);
        dy = pow(dy, 2);

        dist = sqrt(dx + dy);

        return dist;
    }
    @Override
    public double area() {
        double s, t;
        s = (this.ab + this.bc + this.ac) / 2.0;
        t = sqrt( s*(s-this.ab)*(s-this.bc)*(s-this.ac) );
        return t;
    }

    @Override
    public String pointsToString() {
        return String.format("(%s,%s)(%s,%s)(%s,%s)",
                a.getX(), a.getY(),
                b.getX(), b.getY(),
                c.getX(), c.getY());
    }
    @Override
    public String toString() {
        return String.format("Triangle[(%s,%s)(%s,%s)(%s,%s)]",
                a.getX(), a.getY(),
                b.getX(), b.getY(),
                c.getX(), c.getY());
    }

    @Override
    public Point leftmostPoint() {
        double lx = a.getX();
        Point lp = a;
        if (b.getX() < lx) {
            lx = b.getX();
            lp  = b;
        }
        if (c.getX() < lx) {
            lp = c;
        }
        return lp;
    }

}
