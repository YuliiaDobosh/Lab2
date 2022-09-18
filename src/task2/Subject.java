package task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subject {
    private String nameSubject;
    private List<LocalDate> meetingDates;
    private Map<Student, Integer> studentMarks;

    public Subject(final String nameSubject) {
        this.nameSubject = nameSubject;
        this.meetingDates = new ArrayList<LocalDate>();
        this.studentMarks = new HashMap<Student, Integer>();
    }

    public Subject(final String nameSubject, final List<LocalDate> meetingDates) {
        this.nameSubject = nameSubject;
        this.meetingDates = meetingDates;
        this.studentMarks = new HashMap<Student, Integer>();
    }

    public Subject(final String nameSubject, final List<LocalDate> meetingDates, final Map<Student, Integer> studentMarks) {
        this.nameSubject = nameSubject;
        this.meetingDates = meetingDates;
        this.studentMarks = studentMarks;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(final String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public List<LocalDate> getMeetingDates() {
        return meetingDates;
    }

    public void setMeetingDates(final List<LocalDate> meetingDates) {
        this.meetingDates = meetingDates;
    }

    public Map<Student, Integer> getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(final Map<Student, Integer> studentMarks) {
        this.studentMarks = studentMarks;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(nameSubject);
        if (meetingDates.size() > 0) {
            builder.append('[');
            for (final LocalDate localDate : meetingDates) {
                builder.append(localDate).append(", ");
            }
            builder.deleteCharAt(builder.length() - 1);
            builder.deleteCharAt(builder.length() - 1);
            builder.append(']');
        }
        return builder.toString();
    }
}
