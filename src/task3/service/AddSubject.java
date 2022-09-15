package task3.service;

import task2.Student;
import task2.StudentSubject;
import task2.University;

public class AddSubject {
    final private University university;

    public AddSubject(final University university) {
        this.university = university;
    }

    public void add(final String nameSubject, final String group) {
        for (final Student student : university.getStudents()) {
            if (student.getGroup().equals(group)) {
                student.getSubjects().add(new StudentSubject(nameSubject));
            }
        }
    }
}
