package by.epam.geometry.entity;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return (int) ((56 / x) * 15 + y);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("Point {\n");
        string.append("X:").append(this.x).append("\n");
        string.append("Y:").append(this.y).append("\n}");
        return string.toString();
    }
}
