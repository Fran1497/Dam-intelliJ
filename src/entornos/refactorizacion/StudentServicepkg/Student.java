package entornos.refactorizacion.StudentServicepkg;

import java.util.List;
public class Student {
    private final String name;
    private final List<Double> grades;
    private final boolean recoveryExam;
    private final Double recoveryGrade;
    public Student(String name, List<Double> grades, boolean recoveryExam, Double
            recoveryGrade) {
        this.name = name;
        this.grades = grades;
        this.recoveryExam = recoveryExam;
        this.recoveryGrade = recoveryGrade;
    }
    public String getName() {
        return name;
    }
    public List<Double> getGrades() {
        return grades;
    }
    public boolean hasRecoveryExam() {
        return recoveryExam;
    }
    public Double getRecoveryGrade() {
        return recoveryGrade;
    }
}