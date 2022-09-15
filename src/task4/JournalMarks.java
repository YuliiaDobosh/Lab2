package task4;

import task2.Student;
import task2.University;

import java.util.List;
import java.util.Map;

public class JournalMarks {
    private Map<Student, Double> studentsMap;

    private double calcMarkPerSemester(final List<Double> marks) {
        return marks.stream().mapToDouble(Double::doubleValue).sum() / marks.size();
    }

    public JournalMarks(final Map<Student, Double> studentsMap) {
        this.studentsMap = studentsMap;
    }

    public JournalMarks(final University university) { // TODO
        for (final Student student : university.getStudents()) {
            //studentsMap.put(student, )
        }
    }

    public Map<Student, Double> getStudentsMap() {
        return studentsMap;
    }

    public void setStudentsMap(final Map<Student, Double> studentsMap) {
        this.studentsMap = studentsMap;
    }
}
