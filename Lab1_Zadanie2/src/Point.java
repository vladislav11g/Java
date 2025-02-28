import com.sun.source.tree.ReturnTree;

public class Point
{
    public float x, y;

    public String toString ()
    {
        return  "(" + x + " " + y + ")";
    }

    public String toSvg (float r)
    {
        return  "<circle r=\"" + r + " cx=\"" + x + "\" cy=\"" + y + "\" fill=\"red\" />";
    }
}
