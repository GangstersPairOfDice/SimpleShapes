class Circle extends Shape {

    //fields - attributes
    private double radius;

    //constructor - creates
    Circle(String circleName, vec2d center, double radius) {
        this.name = circleName;
        this.center = center;
        this.radius = radius;
    }

    //methods - like calculating area
    public vec2d getCenter() {
        return center;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean isIntersecting(vec2d point) {
        return point.getDistance(center) <= radius;
    }
}
