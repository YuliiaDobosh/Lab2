package task3;

import task2.Student;
import task2.University;
import task3.service.AddSubject;
import task3.service.AddSubjectDate;
import task3.service.SortStudent;
import task3.service.StudentBySubject;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(final String[] args) {
        final University university = task2.Main.university;
        System.out.println(university);
        final AddSubject addSubject = new AddSubject("High Math");
        addSubject.add(university, "IT-11");
        System.out.println(university);

        final AddSubjectDate addSubjectDate = new AddSubjectDate();
        addSubjectDate.add(university, "KN-11", "Data Analysis", "2022-10-04");
        System.out.println(university);

        final StudentBySubject studentBySubject = new StudentBySubject(university);
        final List<Student> list = studentBySubject.getList("High Math");
        studentBySubject.display(list);

        final SortStudent sortStudent = new SortStudent(university);
        final List<Student> list1 = sortStudent.getList();
        sortStudent.display(list1);
    }
}
