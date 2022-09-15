package task2;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    private int days;
    private int months;
    private int year;

    public int getDays() {
        return days;
    }

    public void setDays(final int days) {
        this.days = days;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(final int months) {
        this.months = months;
    }

    public int getYear() {
        return year;
    }

    public void setYear(final int year) {
        this.year = year;
    }

    public Date(final String date) {
        final LocalDate localDateTime = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        this.year = localDateTime.getYear();
        this.months = localDateTime.getMonth().getValue();
        this.days = localDateTime.getDayOfMonth();
    }

    public Date(final int days, final int months, final int year) {
        this.days = days;
        this.months = months;
        this.year = year;
    }

    @Override
    public String toString() {
        return year + "." + months + "." + days;
    }
}
