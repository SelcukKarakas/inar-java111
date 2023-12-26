package week_13.assignments.Question_13_08;

public class Question_13_08 {




        public static void main(String[] args) {
            doTheTrick();
        }
        private static void doTheTrick() {
            MyStack myStack1 = new MyStack();

            myStack1.push(4);
            myStack1.push(5);
            myStack1.push(6);

            MyStack myStack2 = myStack1.clone();

            myStack1.pop();

            System.out.println(myStack1);
            System.out.println(myStack2);
        }
    }

