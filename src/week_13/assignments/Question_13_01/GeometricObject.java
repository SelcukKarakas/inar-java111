package week_13.assignments.Question_13_01;

import java.util.Date;

public abstract class GeometricObject {

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


    @Override
    public String toString() {
        return "GeometricObject{" + "name='" + color + '\'' + ", filled=" + filled + '}';
    }
}

