package week_13.assignments.Question_13_10;

import week_13.assignments.Question_13_05.GeometricObject;






    public class Rectangle extends GeometricObject {
        private double width;
        private double height;

        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }

        public Rectangle(double width, double height, String color, boolean filled) {
            super(color, filled);
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return width * height;
        }

        public double getPerimeter() {
            return 2 * width + 2 * height;
        }
        @Override
        public String toString() {
            return "Rectangle" +
                    "\nwidth = " + width +
                    "\nheight = " + height;
        }
        @Override
        public boolean equals(GeometricObject o) {
            return this.getArea()==o.getArea();
        }
        @Override
        public int compareTo(GeometricObject o){
            return Double.compare(this.getArea(), o.getArea());
        }
    }

