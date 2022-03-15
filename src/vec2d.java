class vec2d {
    double x;
    double y;

    vec2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double length() {
        return Math.sqrt((x * x) + (y * y));
    }

    //Math.sqrt() operation is expensive, so we preferably should find the square of the length instead
    double sqrLength() {
        return ((x * x) + (y * y));
    }

    double dot(vec2d dottedVector) {
        return ((x * dottedVector.x) + (y * dottedVector.y));
    }

    double getDistance(vec2d endVector) {
        return Math.sqrt(Math.pow(endVector.x - x, 2) + Math.pow(endVector.y - y, 2));
    }


    //normalizes the vector - sets length to 1 - useful for tangent calculations
    vec2d normalize() {
        double length = length();
        return new vec2d(x / length, y / length);
    }

    vec2d scalMult(double scalar) {
        return new vec2d(x * scalar, y * scalar);
    }

    vec2d scalDiv(double scalar) {
        return new vec2d(x / scalar, y / scalar);
    }

    vec2d vecAdd(vec2d addedVector) {
        return new vec2d(x + addedVector.x, y + addedVector.y);
    }

    vec2d vecSubtract(vec2d subtractedVector) {
        return new vec2d(x - subtractedVector.x, y - subtractedVector.y);
    }
}
