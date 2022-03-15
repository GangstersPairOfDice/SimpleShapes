class Rectangle extends Shape {

    vec2d uL; // upper left coordinate
    vec2d bR; // bottom right coordinate
    private double width, height;

    Rectangle(String rectangleName, vec2d upperLeft, vec2d bottomRight) {
        this.name = rectangleName;
        this.uL = upperLeft;
        this.bR = bottomRight;
        // since bR.x >= uL.x and bR.y <= uL.y
        this.width = bR.x - uL.x;
        this.height = uL.y - bR.y;
        this.center = new vec2d((uL.x + bR.x) / 2, (uL.y + bR.y) / 2);
    }

    public vec2d getCenter() {
        return center;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    public boolean isIntersecting(vec2d point) {
        return point.x >= uL.x &&   // above the bottom
                point.x <= bR.x &&  // right of the left side AND
                point.y <= uL.y &&  // left of the right side AND
                point.y >= bR.y;    // below the top AND
    }
}
