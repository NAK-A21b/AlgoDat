import algodat.IClosestPoints;

import java.util.List;

public class BruteForceClosestPoints implements IClosestPoints {

    @Override
    public Point find(List<Point> points) {
        Point closest = new Point(-1, -1);
        double closestD = Double.POSITIVE_INFINITY;
        for (int i = 0; i < points.size() - 1; i++) {
            for (int j = i + 1; j < points.size(); j++) {
                final Point p0 = points.get(i);
                final Point p1 = points.get(j);
                final double d = Math.sqrt(Math.pow(p0.getX() - p1.getX(), 2) + Math.pow(p0.getY() - p1.getY(), 2));
                if (d < closestD) {
                    closestD = d;
                    closest = new Point(i, j);
                }
            }
        }
        return closest;
    }
}
