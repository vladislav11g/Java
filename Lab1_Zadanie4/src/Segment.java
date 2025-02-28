public class Segment {
    public Point first, second;

    public Segment(){}

    public Segment(Point _first, Point _second) {
        first = _first;
        second = _second;
    }

    public double length()
    {
        return Math.sqrt(Math.pow(first.x - second.x, 2) + Math.pow(first.y - second.y, 2));
    }
}
