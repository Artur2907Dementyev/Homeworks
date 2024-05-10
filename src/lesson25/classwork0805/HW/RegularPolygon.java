package lesson25.classwork0805.HW;

import lesson25.classwork0805.example02.Shape;

public class RegularPolygon implements Shape {
    private final int sides;
    private final double sideLength;

    public RegularPolygon(int sides, double sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    @Override
    public double getSquare() {
        return sides * sideLength;
    }
}
