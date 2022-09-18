package task3.service;

import task2.Group;
import task2.Student;
import task2.Subject;
import task2.University;

public class AddSubject {
    final private Subject subject;

    public AddSubject(final String nameSubject) {
        this.subject = new Subject(nameSubject);
    }

    public void add(final University university, final String groupName) {
        for (final Group group : university.getGroups()) {
            if (group.getGroupName().equals(groupName)) {
                group.getSubjects().add(subject);
            }
        }
    }
}
