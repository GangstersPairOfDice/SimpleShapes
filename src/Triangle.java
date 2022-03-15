class Triangle extends Shape {

    vec2d pointA;
    vec2d pointB;
    vec2d pointC;

    Triangle(String triangleName, vec2d pointA, vec2d pointB, vec2d pointC) {
        this.name = triangleName;
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.center = new vec2d((pointA.x + pointB.x + pointC.x) / 3, (pointA.y + pointB.y + pointC.y) / 3);
    }

    public vec2d getCenter() {
        return center;
    }

    public double getArea() {
        return Math.abs(pointA.x * (pointB.y - pointC.y) + pointB.x * (pointC.y - pointA.y) + pointC.x * (pointA.y - pointB.y)) / 2;
    }

    public double getPerimeter() {
        return pointA.getDistance(pointB) + pointB.getDistance(pointC) + pointC.getDistance(pointA);
    }

    public boolean isIntersecting(vec2d point) {
        Triangle area1 = new Triangle("area1", point, pointA, pointB);
        Triangle area2 = new Triangle("area2", point, pointB, pointC);
        Triangle area3 = new Triangle("area3", point, pointA, pointC);

        return area1.getArea() + area2.getArea() + area3.getArea() == this.getArea();
    }
}
