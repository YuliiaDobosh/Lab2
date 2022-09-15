package task2;

import java.util.List;

public class Student {
    private String fullName;
    private String group;
    private String speciality;
    private List<StudentSubject> subjects;

    public String getGroup() {
        return group;
    }

    public void setGroup(final String group) {
        this.group = group;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(final String fullName) {
        this.fullName = fullName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(final String speciality) {
        this.speciality = speciality;
    }

    public List<StudentSubject> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<StudentSubject> subjects) {
        this.subjects = subjects;
    }

    public Student(final String fullName, final String speciality, final String group, final List<StudentSubject> subjects) {
        this.fullName = fullName;
        this.speciality = speciality;
        this.group = group;
        this.subjects = subjects;
    }

    public Student(final String fullName, final String speciality, final String group) {
        this.fullName = fullName;
        this.speciality = speciality;
        this.group = group;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("full name: ").append(fullName).append('\n');
        builder.append("speciality: ").append(speciality).append('\n');
        builder.append("group: ").append(group).append('\n');
        for (final StudentSubject subject : subjects) {
            builder.append(subject).append('\n');
        }
        return builder.toString();
    }
}
