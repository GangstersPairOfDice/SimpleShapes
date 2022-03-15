public class Main {
    public static void main(String[] args) {

        // Unit tests

        // Vectors

        vec2d v1 = new vec2d(1,1);
        vec2d v2 = new vec2d(3,1);

        System.out.println("Vector Unit tests, v1=[1,1] and v2=[3,1]");
        System.out.println();
        System.out.println("The length of v1 from the origin is:");
        System.out.println(v1.length());
        System.out.println("v1.x * 3 =");
        System.out.println(v1.scalMult(3).x);
        System.out.println("v2.x / 3 =");
        System.out.println(v2.scalDiv(3).x);
        System.out.println("v1.x + v2.x =");
        System.out.println(v1.vecAdd(v2).x);
        System.out.println("v2.x - v1.x =");
        System.out.println(v2.vecSubtract(v1).x);
        System.out.println("v2 normalized length ~ 1");
        System.out.println(v2.normalize().length());
        System.out.println("The distance from v1 to v2");
        System.out.println(v1.getDistance(v2));
        System.out.println();

        // Circles
        Circle c1 = new Circle("cool circle 1",  new vec2d(1,1),1);
        Circle c2 = new Circle("cool circle 2",  new vec2d(4,1),2);

        System.out.println("ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println("We are the circles, our names are "+ c1.name+ " and "+c2.getName()+".");
        System.out.println("ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println();
        System.out.println("The center of c1 is: ("+c1.getCenter().x+"x, "+c1.center.y+"y)");
        System.out.println("The length of c1's center from the origin is: "+c1.center.length());
        System.out.println("The area of c1 is: "+c1.getArea());
        System.out.println("The perimeter of c1 is: "+c1.getPerimeter());
        System.out.println("The center of c2 is: ("+c2.getCenter().x+"x, "+c2.center.y+"y)");
        System.out.println("Is the center of c2 inside of c1? "+ c1.isIntersecting(c2.getCenter()));
        System.out.println("What is the distance from the centers of c1 and c2?: "+c1.getCenter().getDistance(c2.getCenter()));
        System.out.println();

        // Rectangles
        Rectangle r1 = new Rectangle("rookie rectangle 1",  new vec2d(0,2), new vec2d(2,0));
        Rectangle r2 = new Rectangle("rookie rectangle 2",  new vec2d(-1,-2), new vec2d(2,-2));

        System.out.println("[][][][][][][][][][]][][][][][][][][][][][][][][][][][][][][][][][][][]");
        System.out.println("We are the rectangles, our names are "+ r1.name+ " and "+r2.getName()+".");
        System.out.println("[][][][][][][][][][]][][][][][][][][][][][][][][][][][][][][][][][][][]");
        System.out.println();
        System.out.println("The center of r1 is: ("+r1.getCenter().x+"x, "+r1.center.y+"y)");
        System.out.println("The center of r2 is: ("+r2.getCenter().x+"x, "+r2.center.y+"y)");
        System.out.println("The area of r1 is: "+r1.getArea());
        System.out.println("The perimeter of r1 is: "+r1.getPerimeter());
        System.out.println("The area of r2 is: "+r2.getArea());
        System.out.println("The perimeter of r2 is: "+r2.getPerimeter());
        System.out.println("Is the center of c1 inside of r1? "+r1.isIntersecting(c1.center));
        System.out.println("What is the distance from the centers of c1 and r1?: "+c1.getCenter().getDistance(r1.getCenter()));
        System.out.println();

        // Triangles
        Triangle t1 = new Triangle("thoughtful triangle 1",  new vec2d(0,4), new vec2d(0,2), new vec2d(2,2));
        Triangle t2 = new Triangle("thoughtful triangle 2",  new vec2d(4,4), new vec2d(2,2), new vec2d(6,-1));

        System.out.println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV");
        System.out.println("We are the triangles, our names are "+ t1.name+ " and "+t2.getName()+".");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println();
        System.out.println("The center of t1 is: ("+t1.getCenter().x+"x, "+t1.center.y+"y)");
        System.out.println("The center of t2 is: ("+t2.getCenter().x+"x, "+t2.center.y+"y)");
        System.out.println("The area of t1 is: "+t1.getArea());
        System.out.println("The perimeter of t1 is: "+t1.getPerimeter());
        System.out.println("The area of t2 is: "+t2.getArea());
        System.out.println("The perimeter of t2 is: "+t2.getPerimeter());
        System.out.println("Is the center of c2 inside of t2? "+t2.isIntersecting(c2.center));
        System.out.println("What is the distance from the centers of c2 and r2?: "+c2.getCenter().getDistance(t2.getCenter()));
        System.out.println();

        // Regular Polygons
        RegularPolygon poly1 = new RegularPolygon("perfect polygon 1", 4,2, new vec2d(1,4));
        RegularPolygon poly2 = new RegularPolygon("perfect polygon 2", 6,1, c2.center);

        System.out.println("------------------------------------------------------------------------");
        System.out.println("We are the regular polygons, our names are "+ poly1.name+ " and "+poly2.getName()+".");
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println("The center of poly1 is: ("+poly1.getCenter().x+"x, "+poly1.center.y+"y)");
        System.out.println("The center of poly2 is: ("+poly2.getCenter().x+"x, "+poly2.center.y+"y)");
        System.out.println("The area of poly1 is: "+poly1.getArea());
        System.out.println("The perimeter of poly1 is: "+poly1.getPerimeter());
        System.out.println("The area of poly2 is: "+poly2.getArea());
        System.out.println("The perimeter of poly2 is: "+poly2.getPerimeter());
        System.out.println("What is the distance from the centers of poly2 and r1?: "+poly2.getCenter().getDistance(r1.getCenter()));

    }
}
