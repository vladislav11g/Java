public class Point {
    public float x, y;

    public Point(){}

    private Point(float _x, float _y){
        x = _x;
        y = _y;
    }

    public String toString() {
        return "(" + x + " " + y + ")";
    }

    public String toSvg(float r) {
        return "<circle r=\"" + r + " cx=\"" + x + "\" cy=\"" + y + "\" fill=\"red\" />";
    }

    public void translate(float dx, float dy) {
        x += dx;
        y += dy;
    }

    public Point translated(float dx, float dy) {
        return new Point(x + dx, y + dy);
    }
}
