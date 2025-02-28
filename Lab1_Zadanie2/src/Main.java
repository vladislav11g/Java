import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Point pnt = new Point();
        pnt.x = in.nextInt();
        pnt.y = in.nextInt();
        float r = in.nextFloat();

        System.out.println("Point:");
        System.out.println(pnt.toString());
        System.out.println(pnt.toSvg(r));

        Circle crl = new Circle();
        crl.origin = pnt;
        crl.radius = r;

        System.out.println("Circle:");
        System.out.println(crl.toString());
        System.out.println(crl.toSvg());
    }
}