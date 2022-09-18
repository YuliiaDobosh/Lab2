package task3.service;

import task2.Group;
import task2.Student;
import task2.Subject;
import task2.University;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class AddSubjectDate {

    public void add(final University university, final String groupName, final String subjectName, final String date) {
        final List<Group> groups = university.getGroups().stream().filter(g -> g.getGroupName().equals(groupName)).collect(Collectors.toList());
        if (groups.size() < 1) {
            university.getGroups().add(new Group(groupName));
        }
        for (final Group group : groups) {
            final List<Subject> subjects = group.getSubjects().stream().filter(s -> s.getNameSubject().equals(subjectName)).collect(Collectors.toList());
            if (subjects.size() < 1) {
                group.getSubjects().add(new Subject(subjectName));
            }
            for (final Subject subject : subjects) {
                subject.getMeetingDates().add(LocalDate.parse(date));
            }
        }
    }
}
