package task3;

import task2.Date;
import task2.Student;
import task2.StudentSubject;
import task2.University;
import task3.service.AddSubject;
import task3.service.SortStudent;
import task3.service.StudentBySubject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(final String[] args) {
        final University university = new University();
        university.getStudents().add(new Student("Erik Thompson", "Cyber security", "KN-11", Stream.of(new StudentSubject(
                "Programming",
                Stream.of(new Date("2022.07.22"), new Date("2022.07.25")).collect(Collectors.toList()),
                Stream.of(3.4, 4.5, 5.).collect(Collectors.toList()))).collect(Collectors.toList())));

        university.getStudents().add(new Student("Carl Edward", "Cyber security", "KN-11", Stream.of(new StudentSubject(
                "Programming",
                Stream.of(new Date("2022.07.22"), new Date("2022.07.25")).collect(Collectors.toList()),
                Stream.of(3.8, 4.0, 5., 4.4).collect(Collectors.toList()))).collect(Collectors.toList())));

        university.getStudents().add(new Student("Alex Golden", "Cyber security", "KN-11", Stream.of(new StudentSubject(
                "Programming",
                Stream.of(new Date("2022.07.22"), new Date("2022.07.25")).collect(Collectors.toList()),
                Stream.of(5., 3.3, 4.).collect(Collectors.toList()))).collect(Collectors.toList())));


        university.getStudents().add(new Student("Svetoslav Pit", "Computer Science", "IT-21", Stream.of(
                new StudentSubject(
                        "Programming",
                        Stream.of(new Date("2022.07.23"), new Date("2022.07.27")).collect(Collectors.toList()),
                        Stream.of(5., 3.3, 4.).collect(Collectors.toList())),
                new StudentSubject(
                        "Math",
                        Stream.of(new Date("2022.07.22"), new Date("2022.07.25")).collect(Collectors.toList()),
                        Stream.of(5., 3.3, 4.).collect(Collectors.toList()))).collect(Collectors.toList())));

        university.getStudents().add(new Student("Janice Gunnbjǫrg", "Computer Science", "IT-21",Stream.of(
                new StudentSubject(
                        "Programming",
                        Stream.of(new Date("2022.07.23"), new Date("2022.07.27")).collect(Collectors.toList()),
                        Stream.of(3., 3.3, 4.).collect(Collectors.toList())),
                new StudentSubject(
                        "Math",
                        Stream.of(new Date("2022.07.22"), new Date("2022.07.25")).collect(Collectors.toList()),
                        Stream.of(4.6, 3.65, 4.13).collect(Collectors.toList()))).collect(Collectors.toList())));

        System.out.println(university);

        final AddSubject addSubject = new AddSubject(university);
        addSubject.add("Physic", "IT-21");
        System.out.println(university);

        final SortStudent sortStudent = new SortStudent(university);
        final List<Student> students = sortStudent.getList();
        sortStudent.display(students);
        System.out.println();
        final StudentBySubject studentBySubject = new StudentBySubject(university);
        final List<Student> students1 = studentBySubject.getList("Physic");
        studentBySubject.display(students1);
    }
}
