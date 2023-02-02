package com.epam.training.student_andrii_dolhopolov.enums.compas;

public enum Direction {
    N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);

    Direction(final int degrees) {
        this.degrees = degrees;
    }

    private final int degrees;

    public static Direction ofDegrees(int degrees) {
        int d = degrees;
        while( d >= 360 ){
            d -= 360;
        }
        while( d < 0 ){
            d += 360;
        }
        for (Direction val : Direction.values()) {
            if (val.degrees == d) return val;
        }
        return null;
    }

    public static Direction closestToDegrees(int degrees) {
        int d =degrees;
        while( d >= 360 ){
            d -= 360;
        }
        while( d < 0 ){
            d += 360;
        }

        int m = d / 45;
        int o = d % 45;
        if ( o > 22 ) { m++; }
        m *= 45;
        for (Direction val : Direction.values()) {
            if (Math.abs(val.degrees - m) == 0) return val;
        }
        return null;
    }

    public Direction opposite() {
        for (Direction val : Direction.values()) {
            if (Math.abs(val.degrees - this.degrees) == 180) return val;
        }
        return null;
    }

    public int differenceDegreesTo(Direction direction) {

        int t1 = Math.abs(direction.degrees - this.degrees);
        if(t1 > 180){
        t1 = 360 - t1;
        }
        return t1;

    }
}
