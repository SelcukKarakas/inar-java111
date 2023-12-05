package week_10.assignments.question_10_14;

import java.util.GregorianCalendar;






    public class MyDate11 {
        private int day;
        private int month;
        private int year;

        public MyDate11() {
            this(System.currentTimeMillis());
        }

        MyDate11(long elapsedTime) {
            setDate(elapsedTime);
        }

        MyDate11(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public int getYear() {
            return year;
        }

        public String getMonth() {
            String m = String.valueOf(month + 1);
            return (month < 10 ? "0" + m : m);
        }

        public String getDay() {
            String d = String.valueOf(day);
            return (day < 10 ? "0" + d : d);
        }

        public void setDate(long elapsedTime) {
            GregorianCalendar calander = new GregorianCalendar();
            calander.setTimeInMillis(elapsedTime);
            year = calander.get(GregorianCalendar.YEAR);
            month = calander.get(GregorianCalendar.MONTH);
            day = calander.get(GregorianCalendar.DAY_OF_MONTH);
        }
        @Override
        public String toString(){
            return getDay()+"."+getMonth()+"."+getYear();
        }
    }

