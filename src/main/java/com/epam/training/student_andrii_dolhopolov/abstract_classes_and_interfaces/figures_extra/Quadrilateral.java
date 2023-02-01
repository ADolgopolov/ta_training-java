package com.epam.training.student_andrii_dolhopolov.abstract_classes_and_interfaces.figures_extra;

import java.util.ArrayList;

class Quadrilateral extends Figure{

    private final Point a, b, c, d;
    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        if(p1==null){ throw new IllegalArgumentException();}
        if(p2==null){ throw new IllegalArgumentException();}
        if(p3==null){ throw new IllegalArgumentException();}
        if(p4==null){ throw new IllegalArgumentException();}
        Triangle temp = new Triangle(p1, p2, p3);
        if (temp.area() <= 0.001) {
            throw new IllegalArgumentException();}
                 temp = new Triangle(p2, p3, p4);
        if (temp.area() <= 0.001) {
            throw new IllegalArgumentException();}
                 temp = new Triangle(p3, p4, p1);
        if (temp.area() <= 0.001) {
            throw new IllegalArgumentException();}
                 temp = new Triangle(p4, p1, p2);
        if (temp.area() <= 0.001) {
            throw new IllegalArgumentException();}


        if (intersectPoint(p1, p3, p2, p4) == null) {
            throw new IllegalArgumentException();}


        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
    }
    private Point intersectPoint(Point start1, Point end1, Point start2, Point end2) {
        double x1 = start1.getX();
        double y1 = start1.getY();
        double x2 = end1.getX();
        double y2 = end1.getY();

        double x3 = start2.getX();
        double y3 = start2.getY();
        double x4 = end2.getX();
        double y4 = end2.getY();

        double t = ((x1 - x3) * (y3 - y4) - (y1 - y3) * (x3 - x4)) / ((x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4));
        double u = ((x1 - x3) * (y1 - y2) - (y1 - y3) * (x1 - x2)) / ((x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4));
        double x = x1 + t * (x2 - x1);
        double y = y1 + t * (y2 - y1);
        if (0.0 <= t && t <= 1.0 && 0.0 <= u && u <= 1.0) {
            //return false;
            return new Point(x, y);
        }
        //return true;
        return null;

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

    public Point getD() {
        return d;
    }

    @Override
    public Point centroid() {
        Triangle t1 = new Triangle(a,b,c);
        Triangle t2 = new Triangle(c,d,a);
        Triangle t3 = new Triangle(a,b,d);
        Triangle t4 = new Triangle(b,c,d);
        return intersectPoint(t1.centroid(), t2.centroid(), t3.centroid(), t4.centroid());
        /*
        // The Center of Equal Masses at the Vertices
        double x = (this.a.getX() + this.b.getX() + this.c.getX() + this.d.getX()) / 4.0;
        double y = (this.a.getY() + this.b.getY() + this.c.getY()  + this.d.getY()) / 4.0;
        return new Point(x,y);
         */
    }

    @Override
    public boolean isTheSame(Figure figure) {
        int i=0;
        if (figure instanceof Quadrilateral)
        {
            Quadrilateral f = (Quadrilateral) figure;
            ArrayList<Point> list = new ArrayList<>();
            list.add(f.getA());
            list.add(f.getB());
            list.add(f.getC());
            list.add(f.getD());
            for (Point p : list) {
                if(p.equals(this.a)) {
                    i++;}
                if(p.equals(this.b)) {
                    i++;}
                if(p.equals(this.c)) {
                    i++;}
                if(p.equals(this.d)) {
                    i++;}
            }
        }
        return (i == 4);
    }

}
