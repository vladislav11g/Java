import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Point pnt = new Point();

        pnt.x = in.nextInt();
        pnt.y = in.nextInt();

        System.out.println(pnt.toString());
    }
}