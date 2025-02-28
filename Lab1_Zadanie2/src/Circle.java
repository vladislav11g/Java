public class Circle
{
    public Point origin;
    public float radius;

    public String toString ()
    {
        return  "< (" + origin.x + " " + origin.y + ") " + radius + ">";
    }

    public String toSvg ()
    {
        return  "<circle r=\"" + radius + " cx=\"" + origin.x + "\" cy=\"" + origin.y + "\" fill=\"red\" />";
    }
}
