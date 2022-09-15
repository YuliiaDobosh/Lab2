package task3.service;

import task2.Student;
import task2.StudentSubject;
import task2.University;

import java.util.ArrayList;
import java.util.List;

public class StudentBySubject {
    final private University university;

    public StudentBySubject(final University university) {
        this.university = university;
    }
    public List<Student> getList(final String nameStudentSubject) {
        final List<Student> list = new ArrayList<>();
        for (final Student student : university.getStudents()) {
            for (final StudentSubject subject : student.getSubjects()) {
                if (subject.getNameSubject().equals(nameStudentSubject)) {
                    list.add(student);
                }
            }
        }
        return list;
    }

    public void display(final List<Student> students) {
        for (final Student student : students) {
            System.out.println(student.getFullName() + " " + student.getGroup());
        }
    }
}
