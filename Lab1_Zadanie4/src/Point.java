import java.util.Scanner;

public class Point {
    public double x, y;

    public Point(){}

    private Point(double _x, double _y){
        x = _x;
        y = _y;
    }

    public static Point readPoint(Scanner in)
    {
        return new Point(in.nextDouble(), in.nextDouble());
    }

    public String toString() {
        return "(" + x + " " + y + ")";
    }

    public String toSvg(double r) {
        return "<circle r=\"" + r + " cx=\"" + x + "\" cy=\"" + y + "\" fill=\"red\" />";
    }

    public void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public Point translated(double dx, double dy) {
        return new Point(x + dx, y + dy);
    }
}
