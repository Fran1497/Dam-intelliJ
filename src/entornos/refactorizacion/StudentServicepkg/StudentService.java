package entornos.refactorizacion.StudentServicepkg;

public class StudentService {
    public String evaluateStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("El estudiante no puede ser null");
        }
        if (student.getGrades() == null || student.getGrades().isEmpty()) {
            throw new IllegalArgumentException("Debe tener notas");
        }
        double sum = 0;
        for (Double grade : student.getGrades()) {
            if (grade < 0 || grade > 10) {
                throw new IllegalArgumentException("Nota inválida: " + grade);
            }
            sum += grade;
        }
        double average = sum / student.getGrades().size();
        if (average < 5 && student.hasRecoveryExam()) {
            average = (average + student.getRecoveryGrade()) / 2;
        }
        String status;
        if (average >= 9) {
            status = "Excelente";
        } else if (average >= 7) {
            status = "Notable";
        } else if (average >= 5) {
            status = "Aprobado";
        } else {
            status = "Suspenso";
        }
        String message = "Alumno: " + student.getName() +
                " | Promedio: " + String.format("%.2f", average) +
                " | Resultado: " + status;
        return message;
    }
}