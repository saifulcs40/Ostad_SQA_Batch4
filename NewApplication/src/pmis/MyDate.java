package pmis;

public class MyDate {
    // instance variable gulo ke private kore rakhte hobe.
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void display() {
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }

    public int getDay(int day) {
        return this.day;
    }

    public void setDay(int day) {
        if (day > 0 && day <= 31) {
            this.day = day;
        } else {
            System.out.println(day + " is an Invalid day!!");
        }
    }

    public int getMonth(int month) {
        return this.month;
    }

    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        } else {
            System.out.println(month + " is an Invalid month!!");
        }
    }

    public int getYear(int year) {
        return this.year;
    }

    public int setYear(int year) {
        return this.year;
    }

}
