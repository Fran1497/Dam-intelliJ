package entornos.refactorizacion.StudentServicepkg;

import java.util.List;
import java.util.Arrays;

public class Student {

    private final String name;
    private final List<Double> grades;
    private final boolean recoveryExam;
    private final Double recoveryGrade;

    public Student(String name, List<Double> grades, boolean recoveryExam, Double recoveryGrade) {
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

    //Ejemplo en un Main para que veas como funciona David

    public static void main(String[] args) {

        // Creamos un estudiante de prueba
        Student student = new Student(
                "Francisco",
                Arrays.asList(4.0, 6.5, 7.0, 8.0),   // notas
                true,                                // Si tiene examen de recuperación
                7.5                                   // nota de recuperación (que grande no)
        );

        // Creamos el servicio
        StudentService service = new StudentService();

        // Ejecutamos la evaluación
        String resultado = service.evaluateStudent(student);

        // Mostramos el resultado
        System.out.println(resultado);
    }
}






