package week_12.assignments.Question_12_05;





    public class IllegalTriangleException extends Exception {
        public IllegalTriangleException() {
            super("It is illegal triangle !!");
        }

        public IllegalTriangleException(String message) {
            super(message);
        }
    }



