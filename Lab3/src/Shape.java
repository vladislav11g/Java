public abstract class Shape {
    protected final Style style;

    public Shape()
    {
        style = new Style("lime", "purple", 3.0);
    }

    public Shape (final Style style) { this.style = style; }

    public abstract String toSvg();
}
