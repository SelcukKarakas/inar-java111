package week_13.assignments.Question_13_08;

import java.util.ArrayList;






    public class MyStack extends ArrayList<Object> implements Cloneable {
        private ArrayList<Object> list = new ArrayList<>();

        public MyStack() {
        }

        public MyStack(ArrayList<Object> list) {
            this.list = list;
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public int getSize() {
            return list.size();
        }
        public Object peek() {
            return list.get(getSize() - 1);
        }

        public Object pop() {
            Object o = list.get(list.size() - 1);
            list.remove(o);
            return o;
        }

        public void push(Object o) {
            list.add(o);
        }

        @Override
        public String toString() {
            return "Stack : " + list.toString();
        }

        @Override
        public MyStack clone() {
            MyStack clone = (MyStack) super.clone();
            clone.list= new ArrayList<>(this.list);
            return clone;
        }
    }

