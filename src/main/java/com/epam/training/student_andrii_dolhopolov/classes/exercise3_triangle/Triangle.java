package com.epam.training.student_andrii_dolhopolov.classes.exercise3_triangle;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

class Triangle {

    private final Point a;
    private final Point b;
    private final Point c;

    private final double ab, bc, ac;

    public Triangle(Point a, Point b, Point c) {

        this.a = a;
        this.b = b;
        this.c = c;

        this.ab = length(a,b);
        this.bc = length(b,c);
        this.ac = length(a,c);

        if ( (this.ab + this.ac) <= this.bc ){
            throw new IllegalArgumentException();
        }
        if ( (this.ab + this.bc) <= this.ac ){
            throw new IllegalArgumentException();
        }
        if ( (this.ac + this.bc) <= this.ab ){
            throw new IllegalArgumentException();
        }
    }

    public double area() {
        double s, t;
        s = (this.ab + this.bc + this.ac) / 2.0;
        t = sqrt( s*(s-this.ab)*(s-this.bc)*(s-this.ac) );
        return t;
    }

    public Point centroid(){
        double x = (this.a.getX() + this.b.getX() + this.c.getX()) / 3.0;
        double y = (this.a.getY() + this.b.getY() + this.c.getY()) / 3.0;
        return new Point(x,y);
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

}

