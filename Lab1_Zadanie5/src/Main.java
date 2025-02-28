import java.util.Scanner;

public class Main {
    static Segment getLongest (Segment[] segments) {
        Segment longest = segments[0];

        for (Segment seg : segments) {
            if (seg.length() >= longest.length()) {
                longest = seg;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Segment[] segments = new Segment[n];

        for (int i = 0; i < n; i++) {
            segments[i] = Segment.readNewSegment(in);
        }

        System.out.println(getLongest(segments).toString());
        System.out.println(Segment.getLongest(segments).toString());

        in.close();
    }
}