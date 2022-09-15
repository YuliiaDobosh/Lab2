package task3.service;

import task2.Student;
import task2.University;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortStudent {
    final private University university;

    public SortStudent(final University university) {
        this.university = university;
    }

    public List<Student> getList() {
        final List<Student> list = new ArrayList<Student>(university.getStudents());
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(final Student o1, final Student o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });
        return list;
    }
    public void display(final List<Student> students) {
        for (final Student student : students) {
            System.out.println(student.getFullName() + " " + student.getGroup());
        }
    }
}
