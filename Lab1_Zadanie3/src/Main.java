import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Point pnt = new Point();
        pnt.x = in.nextInt();
        pnt.y = in.nextInt();

        float dx = in.nextInt();
        float dy = in.nextInt();

        pnt.translate(dx, dy);
        System.out.println(pnt.toString());

        Point move = pnt.translated(dx, dy);
        System.out.println(move.toString());

        in.close();
    }
}