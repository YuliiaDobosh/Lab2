package task4;

import task2.University;

public class Main {
    public static void main(final String[] args) {
        final University university = task2.Main.university;
        System.out.println(university);

        final JournalMarks journalMarks = new JournalMarks(university);
        // перегляду усіх оцінок усіх студентів
        journalMarks.getStudentsMarksMap().forEach(
                (k, v) -> System.out.println(k.getFullName() + " " + v)
        );
        System.out.println();

        // усіх оцінок одного студента
        journalMarks.getStudentMark("Svetoslav Pit").forEach(System.out::println);
        System.out.println();

        // усіх оцінок за певний предмет
        System.out.println(journalMarks.getStudentMarkBySubject("Svetoslav Pit", "Programming"));
    }
}
