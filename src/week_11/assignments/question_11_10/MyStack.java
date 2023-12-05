package week_11.assignments.question_11_10;

import java.util.ArrayList;







    public class MyStack extends ArrayList<Object> {
        public static final int DEFAULT_CAPACITY = 16;

        public MyStack() {
            super(DEFAULT_CAPACITY);
        }

        public MyStack(int capacity) {
            super(capacity);
        }

        public Object peek() {
            return super.get(super.size() - 1);
        }

        public Object pop() {
            return super.remove(super.size() - 1);
        }

        public void push(Object o) {
            super.add(o);
        }

        public int getSize() {
            return super.size();
        }

        @Override
        public String toString() {
            return "Stack: " + super.toString();
        }

    }

