package task4;

import task2.Student;
import task2.Subject;
import task2.University;
import task3.service.SortStudent;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JournalMarks {
    private Map<Student, List<PairSubjectMark>> studentsMarksMap;

    public JournalMarks(final Map<Student, List<PairSubjectMark>> studentsMarksMap) {
        this.studentsMarksMap = studentsMarksMap;
    }

    public JournalMarks(final University university) {
        this.studentsMarksMap = new HashMap<Student, List<PairSubjectMark>>();
        final SortStudent sortStudent = new SortStudent(university);
        final List<Student> listAllStudents = sortStudent.getList();

        for (final Student student : listAllStudents) {
            final List<PairSubjectMark> pairSubjectMarkList = new ArrayList<PairSubjectMark>();
            student.getSubjects().forEach(
                    subject -> pairSubjectMarkList.add(new PairSubjectMark(subject, subject.getStudentMarks().get(student)))
            );
            studentsMarksMap.put(student, pairSubjectMarkList);
        }
    }

    public Map<Student, List<PairSubjectMark>> getStudentsMarksMap() {
        return studentsMarksMap;
    }

    public void setStudentsMarksMap(final Map<Student, List<PairSubjectMark>> studentsMarksMap) {
        this.studentsMarksMap = studentsMarksMap;
    }

    public void addToMark(final String studentName, final String subjectName, final int value) {
        studentsMarksMap.forEach(
                (k, v) -> {
                    if (k.getFullName().equals(studentName)) {
                        v.forEach(
                                pair ->
                                {
                                    if (pair.getSubject().getNameSubject().equals(subjectName)) {
                                        pair.setMark(pair.getMark() + value);
                                    }
                                }
                        );
                    }
                }
        );
    }
    public void minusFromMark(final String studentName, final String subjectName, final int value) {
        addToMark(studentName, subjectName, -value);
    }

    public List<PairSubjectMark> getStudentMark(final Student key) {
        return studentsMarksMap.get(key);
    }

    public List<PairSubjectMark> getStudentMark(final String studentName) {
        for (final Map.Entry<Student, List<PairSubjectMark>> entry : studentsMarksMap.entrySet()) {
            if (entry.getKey().getFullName().equals(studentName)) {
                return entry.getValue();
            }
        }
        throw new InvalidParameterException("There is no such student");
    }

    public PairSubjectMark getStudentMarkBySubject(final Student key, final Subject subject) {
        final List<PairSubjectMark> pairSubjectMarkList = getStudentMark(key);
        return pairSubjectMarkList.stream().filter(pair -> pair.getSubject().equals(subject)).findFirst().get();
    }

    public PairSubjectMark getStudentMarkBySubject(final String studentName, final String subjectName) {
        final List<PairSubjectMark> pairSubjectMarkList = getStudentMark(studentName);
        return pairSubjectMarkList.stream().filter(pair -> pair.getSubject().getNameSubject().equals(subjectName)).findFirst().get();
    }
}