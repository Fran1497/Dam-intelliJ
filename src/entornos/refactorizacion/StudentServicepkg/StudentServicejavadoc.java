package entornos.refactorizacion.StudentServicepkg;

/**
 * Servicio encargado de evaluar a un estudiante calculando su promedio,
 * aplicando recuperación si corresponde, determinando su rendimiento
 * y generando un informe final.
 */
public class StudentServicejavadoc {

    /**
     * Evalúa completamente a un estudiante
     *
     * @param student Estudiante a evaluar.
     * @return Informe final con nombre, promedio y resultado.
     * @throws IllegalArgumentException si el estudiante o sus notas no son válidos.
     */
    public String evaluateStudent(Student student) {
        validateStudent(student);
        validateGrades(student);

        double average = calculateAverage(student);
        average = applyRecoveryIfNeeded(student, average);

        String status = evaluatePerformance(average);

        return formatReport(student, average, status);
    }

    /**
     * Verifica que el estudiante no sea nulo y que tenga una lista de notas válida.
     *
     * @param student Estudiante a validar.
     * @throws IllegalArgumentException si el estudiante es nulo o no tiene notas.
     */
    private void validateStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("El estudiante no puede ser null");
        }
        if (student.getGrades() == null || student.getGrades().isEmpty()) {
            throw new IllegalArgumentException("Debe tener notas");
        }
    }

    /**
     * Comprueba que todas las notas del estudiante estén dentro del rango permitido (0 a 10).
     *
     * @param student Estudiante cuyas notas se validan.
     * @throws IllegalArgumentException si alguna nota está fuera del rango válido.
     */
    private void validateGrades(Student student) {
        for (Double grade : student.getGrades()) {
            if (grade < 0 || grade > 10) {
                throw new IllegalArgumentException("Nota inválida: " + grade);
            }
        }
    }

    /**
     * Calcula la media aritmética de las calificaciones del estudiante.
     *
     * @param student Estudiante del que se obtiene la media.
     * @return Media de las notas.
     */
    private double calculateAverage(Student student) {
        double sum = 0;
        for (Double grade : student.getGrades()) {
            sum += grade;
        }
        return sum / student.getGrades().size();
    }

    /**
     * Aplica la nota de recuperación si el estudiante tiene derecho a ella
     * y su media inicial es inferior a 5.
     *
     * @param student Estudiante evaluado.
     * @param average Media inicial calculada.
     * @return Nueva media tras aplicar recuperación, o la original si no procede.
     */
    private double applyRecoveryIfNeeded(Student student, double average) {
        if (average < 5 && student.hasRecoveryExam()) {
            return (average + student.getRecoveryGrade()) / 2;
        }
        return average;
    }

    /**
     * Determina el rendimiento final del estudiante según su media.
     *
     * @param average Media final del estudiante.
     * @return Cadena que representa el rendimiento: Excelente, Notable, Aprobado o Suspenso.
     */
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

    /**
     * Genera un informe final con el nombre del estudiante, su promedio y su resultado.
     *
     * @param student Estudiante evaluado.
     * @param average Media final.
     * @param status Resultado del rendimiento.
     * @return Cadena formateada con el informe final.
     */
    private String formatReport(Student student, double average, String status) {
        return "Alumno: " + student.getName() +
                " | Promedio: " + String.format("%.2f", average) +
                " | Resultado: " + status;
    }
}

