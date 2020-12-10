package by.epam.geometry.entity;

import java.util.Objects;

public class Cone {

    private double cx;
    private double cy;
    private double radius;
    private double height;

    public Cone(double cx, double cy, double radius, double height) {
        this.cx = cx;
        this.cy = cy;
        this.radius = radius;
        this.height = height;
    }

    public double getCx() {
        return cx;
    }

    public void setCx(double cx) {
        this.cx = cx;
    }

    public double getCy() {
        return cy;
    }

    public void setCy(double cy) {
        this.cy = cy;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cone cone = (Cone) o;
        return Double.compare(cone.cx, cx) == 0 &&
                Double.compare(cone.cy, cy) == 0 &&
                Double.compare(cone.radius, radius) == 0 &&
                Double.compare(cone.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cx, cy, radius, height);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("Cone {\n");
        string.append("cx:").append(this.cx).append(",\n");
        string.append("cy:").append(this.cy).append(",\n");
        string.append("r:").append(this.radius).append(",\n");
        string.append("h:").append(this.height).append("\n");
        string.append("}");
        return string.toString();
    }
}
