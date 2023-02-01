package com.epam.training.student_andrii_dolhopolov.abstract_classes_and_interfaces.figures_extra;

import java.util.ArrayList;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

class Triangle extends Figure{
    private final Point a, b, c;
    private final double ab, bc, ac;

    public Triangle(Point p1, Point p2, Point p3) {
        if(p1==null){ throw new IllegalArgumentException();}
        if(p2==null){ throw new IllegalArgumentException();}
        if(p3==null){ throw new IllegalArgumentException();}
        this.a = p1;
        this.b = p2;
        this.c = p3;


        this.ab = length(a,b);
        this.bc = length(b,c);
        this.ac = length(a,c);

        double adx = this.b.getX() - this.a.getX();
        double ady = this.b.getY() - this.a.getY();

        double bdx = this.c.getX() - this.b.getX();
        double bdy = this.c.getY() - this.b.getY();

        double d = bdy * adx - bdx * ady;

        if (Point.toClose(d, 0.0)) { throw new IllegalArgumentException(); }
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    @Override
    public Point centroid() {

        double x = (this.a.getX() + this.b.getX() + this.c.getX()) / 3.0;
        double y = (this.a.getY() + this.b.getY() + this.c.getY()) / 3.0;
        return new Point(x,y);
    }
    public double area() {
        double s, t;
        s = (this.ab + this.bc + this.ac) / 2.0;
        t = sqrt( s*(s-this.ab)*(s-this.bc)*(s-this.ac) );
        return t;
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
    public boolean isTheSame(Figure figure) {
        int i=0;
        if (figure instanceof Triangle f)
        {
            ArrayList<Point> list = new ArrayList<>();
            list.add(f.getA());
            list.add(f.getB());
            list.add(f.getC());
            for (Point p : list) {
                if(p.equals(this.a)) {
                    i++;}
                if(p.equals(this.b)) {
                    i++;}
                if(p.equals(this.c)) {
                    i++;}
                }
        }
        return (i == 3);
    }
}
