import java.util.Scanner;

public class Segment {
    private Point begin, end;

    public Segment() { begin = new Point(); end = new Point(); }

    public Segment(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Segment(Segment old) {
        begin = old.begin;
        end = old.end;
    }

    public void readSegment(Scanner in) {
        begin.readPoint(in);
        end.readPoint(in);
    }

    public static Segment readNewSegment(Scanner in) {
        return new Segment(Point.readNewPoint(in), Point.readNewPoint(in));
    }

    public double length() {
        return Math.sqrt(Math.pow(begin.getX() - end.getX(), 2) + Math.pow(begin.getY() - end.getY(), 2));
    }

    public String toString () {
        return  begin.toString() + " " + end.toString();
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