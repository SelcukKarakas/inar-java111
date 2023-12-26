package week_13.assignments.Question_13_07;

import week_13.assignments.Question_13_05.GeometricObject;






    public class Square extends GeometricObject implements Colorable{
        private double side;

        public Square(double side,String color, boolean filled) {
            super(color, filled);
            this.side = side;
        }

        public double getSide() {
            return side;
        }

        public void setSide(double side) {
            this.side = side;
        }
        public double getArea(){
            return Math.pow(side,2);
        }

        @Override
        public boolean equals(GeometricObject o) {
            return false;
        }

        @Override
        public void howToColor() {
            System.out.println("Dye all four sides");
        }

        @Override
        public String toString() {
            return "Square{" +
                    "side=" + side +
                    '}';
        }

        @Override
        public int compareTo(GeometricObject o) {
            return Double.compare(getArea(),o.getArea());
        }
    }

