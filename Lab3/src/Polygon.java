import javax.swing.text.Style;
import java.sql.Array;

public class Polygon extends Shape
{
    private final Point[] polygon;

    public Polygon (final Point[] polygon) {
        super();

        this.polygon = new Point[polygon.length];

        for (int i = 0; i < polygon.length; i++) {
            this.polygon[i] = new Point(polygon[i]);
        }
    }

    public Polygon (final Point[] polygon, Style style) {
        super(style);

        this.polygon = new Point[polygon.length];

        for (int i = 0; i < polygon.length; i++) {
            this.polygon[i] = new Point(polygon[i]);
        }
    }

    @Override
    public String toString () {
        String res = "";

        for (Point pnt : polygon)
            res += pnt.toString() + " ";

        return res;
    }

    public String toSvg(double offsetX, double offsetY) {
        return "<polygon points=\"" + toString() + "\" style=\"fill: " + style.fillColor + "; stroke: " + style.strokeColor + "; stroke-width: " + style.strokeWidth + ";\" />";
    }

    public BoundingBox boundingBox () {
        double miniX, maxiX;
        double miniY, maxiY;

        miniX = maxiX = polygon[0].getX();
        miniY = maxiY = polygon[0].getY();

        for (int i = 0; i < polygon.length; i++) {
            miniX = Math.min(miniX, polygon[i].getX());
            maxiX = Math.max(maxiX, polygon[i].getX());

            miniY = Math.min(miniY, polygon[i].getY());
            maxiY = Math.max(maxiY, polygon[i].getY());
        }

        return new BoundingBox(miniX, maxiY, maxiX - miniX, maxiY - miniY);
    }

    public void translate(double dx, double dy) {
        for (int i = 0; i < polygon.length; i++) {
            polygon[i].translate(dx, dy);
        }
    }

    public Polygon translated(double dx, double dy) {
        Polygon res = new Polygon(this.polygon);

        res.translate(dx, dy);

        return res;
    }
}
