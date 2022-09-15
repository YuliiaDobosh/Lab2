package task2;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(final List<Student> students) {
        this.students = students;
    }

    public University(final List<Student> students) {
        this.students = students;
    }

    public University() {
        this.students = new ArrayList<Student>();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("students:\n");
        for (final Student student : students) {
            builder.append(student).append('\n');
        }
        return builder.toString();
    }
}
