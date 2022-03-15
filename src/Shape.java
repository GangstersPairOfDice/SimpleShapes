abstract class Shape {

    protected String name;
    public vec2d center;

    public String getName() {
        String name = this.name;
        return name;
    }

    //abstract methods
    public abstract vec2d getCenter();

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract boolean isIntersecting(vec2d point);

}
