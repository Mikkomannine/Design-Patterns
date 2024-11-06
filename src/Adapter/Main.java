package Adapter;

public class Main {
    public static void main(String[] args) {
        NewDateInterFace date = new CalendarToNewDateAdapter();
        date.setDay(1);
        date.setMonth(1);
        date.setYear(2020);
        System.out.println("Date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
        date.advanceDays(10);
        System.out.println("Date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
    }
}
