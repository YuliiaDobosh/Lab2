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

        final List<Student> list = new ArrayList<Student>();
        university.getGroups().stream().forEach(group -> list.addAll(group.getStudents()));
        list.sort(Comparator.comparing(Student::getFullName));
        return list;
    }

    public void display(final List<Student> students) {
        System.out.print('[');
        for (final Student student : students) {
            System.out.print(student.getFullName() + ", ");
        }
        System.out.print(']');
        System.out.println();
    }
}
