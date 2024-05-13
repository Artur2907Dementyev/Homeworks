package lesson25.classwork0805.HW;

class RegularPolygon extends Shape {
    private int sides;
    private double sideLength;

    public RegularPolygon(int sides, double sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    @Override
    double getPerimeter() {
        return sides * sideLength;
    }
}
