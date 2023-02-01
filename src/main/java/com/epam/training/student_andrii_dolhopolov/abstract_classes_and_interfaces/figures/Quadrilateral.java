package com.epam.training.student_andrii_dolhopolov.abstract_classes_and_interfaces.figures;

class Quadrilateral extends Figure{

    private final Point a, b, c, d;
    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
    }

    @Override
    public double area() {
        Triangle t1 = new Triangle(a,b,c);
        Triangle t2 = new Triangle(c,d,a);
        return t1.area() + t2.area();
    }

    @Override
    public String pointsToString() {
        return String.format("(%s,%s)(%s,%s)(%s,%s)(%s,%s)",
                a.getX(), a.getY(),
                b.getX(), b.getY(),
                c.getX(), c.getY(),
                d.getX(), d.getY());
    }

    @Override
    public String toString() {
        return String.format("Quadrilateral[(%s,%s)(%s,%s)(%s,%s)(%s,%s)]",
                a.getX(), a.getY(),
                b.getX(), b.getY(),
                c.getX(), c.getY(),
                d.getX(), d.getY());
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
            lx = c.getX();
            lp = c;
        }
        if (d.getX() < lx) {
            lp = d;
        }
        return lp;
    }
}
