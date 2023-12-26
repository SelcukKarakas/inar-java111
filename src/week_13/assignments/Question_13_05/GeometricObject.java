package week_13.assignments.Question_13_05;

import week_13.assignments.Question_13_07.Colorable;

import java.util.Date;



public abstract class GeometricObject implements Comparable<GeometricObject> {
    String color;
    boolean filled;
    Date dateCreated;

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public boolean isColorable() {
        try {
            Colorable a = (Colorable) this;
            return true;
        } catch (ClassCastException ex) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "name='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i].getArea();
        }
        return sum;
    }

    public abstract double getArea();

    public abstract boolean equals(GeometricObject o) ;
}