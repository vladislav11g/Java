import java.io.*;

public class SvgScene
{
    private Polygon[] scene = new Polygon[3];
    private int cur_pos = 0;

    public void addPolygon(Polygon polygon) {
        scene[cur_pos] = polygon;

        cur_pos = (cur_pos + 1) % 3;
    }

    public String toSvg(double offsetX, double offsetY) {
        return scene[0].toSvg(offsetX, offsetY) + " " + scene[1].toSvg(offsetX, offsetY) + " " + scene[2].toSvg(offsetX, offsetY);
    }

    public void save(final String pathToFile) {
        BoundingBox[] bounding_boxes = new BoundingBox[scene.length];

        double maxiWidth = 0, maxiHeights = 0;

        for (int i = 0; i < scene.length; i++) {
            bounding_boxes[i] = scene[i].boundingBox();

            maxiWidth = Math.max(maxiWidth, bounding_boxes[i].width());
            maxiHeights = Math.max(maxiHeights, bounding_boxes[i].heights());
        }

        String res = "<svg height=\"" + maxiHeights + "\" width=\"" + maxiWidth + "\" xmlns=\"\">" + "\n";

        for (int i = 0; i < scene.length; i++) {
            res += "\t" + scene[i].toSvg(bounding_boxes[i].x(), bounding_boxes[i].y()) + "\n";
        }

        res += "</svg>" + "\n";


        File file = new File(pathToFile);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        }
        catch (Exception e) { }

        try {
            FileWriter file_writer = new FileWriter(file.getAbsoluteFile());
            BufferedWriter buffered_writer = new BufferedWriter(file_writer);

            buffered_writer.write(res);
            buffered_writer.close();
        }
        catch (Exception e) { }
    }
}
