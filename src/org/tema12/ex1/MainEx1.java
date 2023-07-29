package org.tema12.ex1;

import java.util.HashMap;
import java.util.Map;

public class MainEx1 {
    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();

        studentGrades.put("John", 86);
        studentGrades.put("Emma", 92);
        studentGrades.put("Michael", 78);
        studentGrades.put("Sophia", 95);
        studentGrades.put("William", 88);

        System.out.println("Students and their grades are:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        String highestGradeStudent = findStudentWithHighestGrade(studentGrades);
        System.out.println("Student with highest grade is: " + highestGradeStudent);
    }

    private static String findStudentWithHighestGrade(Map<String, Integer> studentGrades) {
        String highestGradeStudent = null;
        int highestGrade = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            String student = entry.getKey();
            int grade = entry.getValue();

            if(grade > highestGrade) {
                highestGrade = grade;
                highestGradeStudent = student;
            }
        }
        return highestGradeStudent;

    }
}