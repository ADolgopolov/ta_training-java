package com.epam.training.student_andrii_dolhopolov.classes.exercise1_line_intersection;

public class Line {

    private final int k;
    private final int b;

    public Line(int k, int b) {

        this.k = k;
        this.b = b;

    }

    public Point intersection(Line other) {
        int x, y;

        if ( this.k == other.k) { return null; }

        x = (other.b - this.b) / (this.k - other.k);
        y = this.k * x + this.b;

        return new Point(x,y);
    }

}

