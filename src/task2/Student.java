package task2;

import java.util.List;

public class Student {
    private String fullName;
    private Group group;
    private List<Subject> subjects;

    public Student(final String fullName, final Group group) {
        this.fullName = fullName;
        this.group = group;
    }

    public Student(final String fullName, final Group group, final List<Subject> subjects) {
        this.fullName = fullName;
        this.group = group;
        this.subjects = subjects;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(final String fullName) {
        this.fullName = fullName;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(final Group group) {
        this.group = group;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(fullName).append(", ").append(group.getGroupName());
        builder.append(", [");
        for (final Subject subject : subjects) {
            builder.append(subject).append(", ");
        }
        builder.append(']');
        return builder.toString();
    }
}
