import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        SvgScene svgScene = new SvgScene();

        for (int poligonNumber = 0; poligonNumber < 3; poligonNumber++) {
            int n = in.nextInt();

            Point[] points = new Point[n];

            for (int i = 0; i < n; i++) {
                points[i] = Point.readNewPoint(in);
            }

            svgScene.addPolygon(new Polygon(points));
        }

        svgScene.save("svgScene.svg");

        in.close();
    }
}

/*
4
0 100
10 123
140 140
50 50

3
0 0
100 100
51 51
 */