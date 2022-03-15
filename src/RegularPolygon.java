class RegularPolygon extends Shape {

    private int sides;
    private double sidesLength;

    RegularPolygon(String polygonName, int sides, double sidesLength, vec2d center) {
        this.name = polygonName;
        this.sides = sides;
        this.sidesLength = sidesLength;
        this.center = center;
    }

    public vec2d getCenter() {
        return center;
    }

    public double getArea() {
        return ((sides * Math.pow(sidesLength, 2)) / (4 * Math.tan(Math.PI / sides)));
    }

    public double getPerimeter() {
        return sides * sidesLength;
    }

    //implementation space
    public boolean isIntersecting(vec2d point) {
        return Math.random() < 0.5;
    }
}
