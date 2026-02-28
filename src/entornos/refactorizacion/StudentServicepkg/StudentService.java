package entornos.refactorizacion.StudentServicepkg;

public class StudentService {

    public String evaluateStudent(Student student) {
        validateStudent(student);
        validateGrades(student);

        double average = calculateAverage(student);
        average = applyRecoveryIfNeeded(student, average);

        String status = evaluatePerformance(average);

        return formatReport(student, average, status);
    }

    // Métodos privados extraídos del metodo largo (EL original)


    //Verifica que el estudiante sea correcto
    private void validateStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("El estudiante no puede ser null");
        }
        if (student.getGrades() == null || student.getGrades().isEmpty()) {
            throw new IllegalArgumentException("Debe tener notas");
        }
    }

    //No debe haber notas neg o por encima de 10
    private void validateGrades(Student student) {
        for (Double grade : student.getGrades()) {
            if (grade < 0 || grade > 10) {
                throw new IllegalArgumentException("Nota inválida: " + grade);
            }
        }
    }


    //Una media
    private double calculateAverage(Student student) {
        double sum = 0;
        for (Double grade : student.getGrades()) {
            sum += grade;
        }
        return sum / student.getGrades().size();
    }


    //Para la recuperacion
    private double applyRecoveryIfNeeded(Student student, double average) {
        if (average < 5 && student.hasRecoveryExam()) {
            return (average + student.getRecoveryGrade()) / 2;
        }
        return average;
    }


    //Literalmente solo en base a la nota te dice Excelente a Suspenso
    private String evaluatePerformance(double average) {
        if (average >= 9) {
            return "Excelente";
        } else if (average >= 7) {
            return "Notable";
        } else if (average >= 5) {
            return "Aprobado";
        } else {
            return "Suspenso";
        }
    }

    //Mas o menos como si fuera un String toString pero con otro enfoque
    private String formatReport(Student student, double average, String status) {
        return "Alumno: " + student.getName() +
                " | Promedio: " + String.format("%.2f", average) +
                " | Resultado: " + status;
    }
}