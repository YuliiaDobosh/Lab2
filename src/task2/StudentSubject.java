package task2;

import java.util.ArrayList;
import java.util.List;

public class StudentSubject { // клас предмент студента
    private String nameSubject;
    private List<Date> meetingDates;
    private List<Double> studentMarks;

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(final String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public List<Date> getMeetingDates() {
        return meetingDates;
    }

    public void setMeetingDates(final List<Date> meetingDates) {
        this.meetingDates = meetingDates;
    }

    public List<Double> getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(final List<Double> studentMarks) {
        this.studentMarks = studentMarks;
    }

    public StudentSubject(final String nameSubject, final List<Date> meetingDates, final List<Double> studentMarks) {
        this.nameSubject = nameSubject;
        this.meetingDates = meetingDates;
        this.studentMarks = studentMarks;
    }

    public StudentSubject(final String nameSubject) {
        this.nameSubject = nameSubject;
        this.meetingDates = new ArrayList<>();
        this.studentMarks = new ArrayList<>();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(nameSubject).append(":\n");
        for (final Date date : this.meetingDates) {
            builder.append("[").append(date).append("]\n");
        }
        builder.append("marks: ");
        for (final Double mark : studentMarks) {
            builder.append(mark).append(" ");
        }
        builder.append('\n');
        return builder.toString();
    }
}
