package week_13.assignments.Question_13_05;


public class Circle extends GeometricObject implements Comparable<GeometricObject> {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius, String color, boolean filled) {
        super(color, filled);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x2, double y2) {
        double distanceOfCenters = Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
        return distanceOfCenters < radius;
    }

    public boolean contains(Circle circle) {
        //if sum of the distance between the centers
        // of circles and second circle's radius is smaller than
        // radius of first circle returns true;
        double x2 = circle.getX();
        double y2 = circle.getY();
        double radius2 = circle.getRadius();
        double distanceOfCenters = Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
        return radius >= (distanceOfCenters + radius2);
    }

    public boolean overlaps(Circle circle) {
        double x2 = circle.getX();
        double y2 = circle.getY();
        double radius2 = circle.getRadius();
        double distance = Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
        return distance < radius2 + radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", dateCreated=" + dateCreated +
                '}';
    }

    @Override
    public boolean equals(week_13.assignments.Question_13_05.GeometricObject o) {
        return this.radius == ((Circle) o).getRadius();
    }

    @Override
    public int compareTo(week_13.assignments.Question_13_05.GeometricObject o) {
        return Double.compare(this.getArea(), ((Circle) o).getArea());
    }
}

