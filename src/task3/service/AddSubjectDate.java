package task3.service;

import task2.Date;
import task2.Student;
import task2.StudentSubject;
import task2.University;

public class AddSubjectDate {
    final private University university;

    public AddSubjectDate(final University university) {
        this.university = university;
    }
    public void add(final String nameStudentSubject, final Date date) {
        for (final Student student : university.getStudents()) {
            for (final StudentSubject subject : student.getSubjects()) {
                if (nameStudentSubject.equals(subject.getNameSubject())) {
                    subject.getMeetingDates().add(date);
                }
            }
        }
    }

    public void add(final String nameStudentSubject, final String date) {
        add(nameStudentSubject, new Date(date));
    }
}
