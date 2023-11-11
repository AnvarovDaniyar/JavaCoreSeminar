package org.example.hw5;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Имеется список студентов. Каждый студент имеет имя, список оценок и специальность.
 * Найдите первых 5 студентов специальности "Информатика" с средним баллом выше 4.5,
 * отсортированных по убыванию среднего балла.
 * В решении не использовать циклы! Только StreamAPI
 */
public class main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Петя", Arrays.asList(5.0, 4.5, 5.0), "Информатика"),
                new Student("Вася", Arrays.asList(3.0, 4.5, 5.0), "Информатика"),
                new Student("Егор", Arrays.asList(3.0, 4.5, 5.0), "Информатика"),
                new Student("Маша", Arrays.asList(5.0, 4.0, 5.0), "Физика"),
                new Student("Катя", Arrays.asList(2.0, 3.5, 5.0), "Физика"),
                new Student("Юля", Arrays.asList(5.0, 4.0, 5.0), "Информатика"),
                new Student("Федя", Arrays.asList(5.0, 5.0, 5.0), "Информатика")
        );
        List<Student> result= students.stream()
                .filter(s -> "Информатика".equals(s.getSpecialty()))
                .limit(5)
                .filter(s -> s.getAverageGrade()>4.5)
                .sorted(Comparator.comparingDouble(Student::getAverageGrade).reversed())
                .collect(Collectors.toList());
        result.forEach(student ->
                System.out.println("Имя: " + student.getName() +
                        ", Специальность: " + student.getSpecialty() +
                        ", Средний балл: " + student.getAverageGrade()));
    }
}
