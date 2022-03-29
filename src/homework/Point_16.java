package homework;

public class Point_16 {
    int x, y;

    // First constructor without args.
    public Point_16() {

    }

    // Second constructor with args.
    public Point_16(int x, int y) {

        this.x = x;
        this.y = y;
    }

    // getX isntance method without any paramenters
    public int getX() {
        return x;
    }

    // gety isntance method without any paramenters
    public int getY() {
        return y;
    }

    // setX isntance method with one paramenter
    public int setX(int x) {
        return x;
    }

    // setY isntance method with one paramenter
    public int setY(int y) {
        return y;
    }

    /*distance method without parameter with double return type
    to calculate distance between two points
    */
    public double distance() {

        return Math.sqrt((x * x) + (y * y));
    }

    /*distance method with two parameter with double return type
    to calculate distance between two points
    */
    public double distance(int x, int y) {

        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    /*distance method with parameter with double return type
        to calculate distance between two points
        */
    public double distance(Point_16 point) {
        return Math.sqrt((this.x - point.getX()) * (this.x - point.getX()) +
                (this.y - point.getY()) * (this.y - point.getY()));
    }

    public static void main(String[] args) {

        Point_16 first = new Point_16(6, 5);
        Point_16 second = new Point_16(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point_16 point = new Point_16();
        System.out.println("distance()= " + point.distance());
    }
}


