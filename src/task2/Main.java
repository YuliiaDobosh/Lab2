package task2;

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
    }
}