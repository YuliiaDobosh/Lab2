package task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public final static University university = getUniversity();
    private static University getUniversity() {
        final University university = new University(new ArrayList<>());
        university.getGroups().add(new Group("KN-11"));
        final Group kn11 = university.getGroups().get(0);
        final List<Subject> subjectsOfKn11 = Stream.of(
                new Subject("High Math", Stream.of(LocalDate.parse("2022-09-19"), LocalDate.parse("2022-09-21")).collect(Collectors.toList())),
                new Subject("Data Analysis", Stream.of(LocalDate.parse("2022-09-20")).collect(Collectors.toList()))
        ).collect(Collectors.toList());
        kn11.setSubjects(subjectsOfKn11);
        kn11.setStudents(Stream.of(
                new Student("Erik Thompson", kn11, subjectsOfKn11),
                new Student("Carl Edward", kn11, subjectsOfKn11),
                new Student("Alex Golden", kn11, subjectsOfKn11)
        ).collect(Collectors.toList()));

        subjectsOfKn11.get(0).getStudentMarks().put(kn11.getStudents().get(0), 50);
        subjectsOfKn11.get(0).getStudentMarks().put(kn11.getStudents().get(1), 64);
        subjectsOfKn11.get(0).getStudentMarks().put(kn11.getStudents().get(2), 67);

        subjectsOfKn11.get(1).getStudentMarks().put(kn11.getStudents().get(0), 95);
        subjectsOfKn11.get(1).getStudentMarks().put(kn11.getStudents().get(1), 69);
        subjectsOfKn11.get(1).getStudentMarks().put(kn11.getStudents().get(2), 74);

        university.getGroups().add(new Group("IT-11"));
        final Group it11 = university.getGroups().get(1);
        final List<Subject> subjectsOfIt11 = Stream.of(
                new Subject("Programming", Stream.of(LocalDate.parse("2022-09-23"), LocalDate.parse("2022-09-22")).collect(Collectors.toList())),
                new Subject("Computer Science", Stream.of(LocalDate.parse("2022-09-19"), LocalDate.parse("2022-09-23")).collect(Collectors.toList()))
        ).collect(Collectors.toList());
        it11.setSubjects(subjectsOfIt11);
        it11.setStudents(Stream.of(
                new Student("Svetoslav Pit", it11, subjectsOfIt11),
                new Student("Janice Bond", it11, subjectsOfIt11),
                new Student("James Thomson", it11, subjectsOfIt11)
        ).collect(Collectors.toList()));

        subjectsOfIt11.get(0).getStudentMarks().put(it11.getStudents().get(0), 85);
        subjectsOfIt11.get(0).getStudentMarks().put(it11.getStudents().get(1), 80);
        subjectsOfIt11.get(0).getStudentMarks().put(it11.getStudents().get(2), 92);

        subjectsOfIt11.get(1).getStudentMarks().put(it11.getStudents().get(0), 66);
        subjectsOfIt11.get(1).getStudentMarks().put(it11.getStudents().get(1), 96);
        subjectsOfIt11.get(1).getStudentMarks().put(it11.getStudents().get(2), 77);

        return university;
    }

    public static void main(final String[] args) {
        System.out.println(university);
    }
}