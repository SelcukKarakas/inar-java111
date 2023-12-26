package week_13.assignments.Question_13_05;






    public class Triangle extends GeometricObject {
        double side1;
        double side2;
        double side3;

        public Triangle(double side1, double side2, double side3, String color, boolean filled) {
            super(color, filled);
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        public double getSide1() {
            return side1;
        }

        public void setSide1(double side1) {
            this.side1 = side1;
        }

        public double getSide2() {
            return side2;
        }

        public void setSide2(double side2) {
            this.side2 = side2;
        }

        public double getSide3() {
            return side3;
        }

        public void setSide3(double side3) {
            this.side3 = side3;
        }

        public double getArea() {
            double s = getPerimeter();
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }

        @Override
        public boolean equals(GeometricObject o) {
            return false;
        }

        public double getPerimeter() {
            return side1 + side2 + side3;
        }

        @Override
        public String toString() {
            return "Color: " + super.getColor() + " and filled: " + super.getColor() +
                    "\nTriangle : side1 : " + side1 +
                    "\nTriangle : side2 : " + side2 +
                    "\nTriangle : side3 : " + side3;
        }
        public int compareTo(QA.week_13.Question_13_05.GeometricObject o){
            return Double.compare(this.getArea(), o.getArea());
        }
    }

