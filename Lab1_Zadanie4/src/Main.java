import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Segment seg = new Segment(Point.readPoint(in), Point.readPoint(in));

        System.out.println(seg.length());

        in.close();
    }
}