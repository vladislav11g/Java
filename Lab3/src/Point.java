import java.util.Scanner;

public class Point {
    private double x = 0, y = 0;

    double getX() { return x; }
    double getY() { return y; }
    void setX(double x) { this.x = x; }
    void setY(double y) { this.y = y; }

    public Point(){}

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(Point old) {
        x = old.x;
        y = old.y;
    }

    public void readPoint(Scanner in) {
        x = in.nextDouble();
        y = in.nextDouble();
    }

    public static Point readNewPoint(Scanner in) {
        return new Point(in.nextDouble(), in.nextDouble());
    }

    public String toString() {
        return x + ", " + y;
    }

    public void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public Point translated(double dx, double dy) {
        return new Point(x + dx, y + dy);
    }
}