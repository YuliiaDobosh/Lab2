package task3.service;

import task2.Group;
import task2.Student;
import task2.University;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentBySubject {
    final private University university;

    public StudentBySubject(final University university) {
        this.university = university;
    }

    public List<Student> getList(final String nameStudentSubject) {
        final List<Student> list = new ArrayList<>();
        for (final Group group : university.getGroups()) {
            list.addAll(group.getStudents().stream().filter(
                    g -> g.getSubjects().stream().filter(
                            subject -> subject.getNameSubject().equals(nameStudentSubject)
                    ).collect(Collectors.toList()).size() > 0
            ).collect(Collectors.toList()));
        }
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
