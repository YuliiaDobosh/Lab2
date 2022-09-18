package task4;

import task2.Subject;

public class PairSubjectMark {
    private Subject subject;
    private Integer mark;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(final Subject subject) {
        this.subject = subject;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(final Integer mark) {
        this.mark = mark;
    }

    public PairSubjectMark(final Subject subject, final Integer mark) {
        this.subject = subject;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return subject.getNameSubject() + ":" + mark;
    }
}
