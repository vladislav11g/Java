import java.util.Scanner;

public class Segment {
    public Point begin, end;

    public Segment(){}

    public Segment(Point _first, Point _second) {
        begin = _first;
        end = _second;
    }

    public void readSegment(Scanner in) {
        begin.readPoint(in);
        end.readPoint(in);
    }

    public static Segment readNewSegment(Scanner in) {
        return new Segment(Point.readNewPoint(in), Point.readNewPoint(in));
    }

    public double length() {
        return Math.sqrt(Math.pow(begin.x - end.x, 2) + Math.pow(begin.y - end.y, 2));
    }

    public String toString () {
        return  "< " + begin.toString() + " " + end.toString() + " >";
    }

    static Segment getLongest (Segment[] segments) {
        Segment longest = segments[0];

        for (Segment seg : segments) {
            if (seg.length() >= longest.length()) {
                longest = seg;
            }
        }

        return longest;
    }
}
