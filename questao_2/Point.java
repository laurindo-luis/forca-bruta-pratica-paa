package questao_2;

public class Point {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance (Point p2) {
        return Math.sqrt(Math.pow(p2.x - this.x, 2) + Math.pow(p2.y - this.y, 2));
    }

    @Override
    public String toString() {
        return String.format("(%f, %f)", this.x, this.y);
    }
}
