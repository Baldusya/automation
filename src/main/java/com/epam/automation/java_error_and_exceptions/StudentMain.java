package com.epam.automation.java_error_and_exceptions;

import java.util.HashMap;
import java.util.Map;

import static com.epam.automation.java_error_and_exceptions.StudentFaculty.*;
import static com.epam.automation.java_error_and_exceptions.StudentSubject.*;

public class StudentMain {
    public static void main(String[] args) {
        Map<StudentSubject, Integer> volodyaSubjects = new HashMap<>();
        volodyaSubjects.put(MATH, 4);
        volodyaSubjects.put(CHEMISTRY, 5);
        Student studentVolodya = new Student(1, "Volodya", "Pupkin",
                INTERNATIONAL_RELATIONS, 3,
                volodyaSubjects);

        Map<StudentSubject, Integer> valeraSubjects = new HashMap<>();
        volodyaSubjects.put(LANGUAGE, 2);
        volodyaSubjects.put(ECONOMY, 3);
        valeraSubjects.put(MATH, 5);
        System.out.println(valeraSubjects);
        Student studentValera = new Student(2, "Valera", "Popkin",
                MMF, 2, valeraSubjects);

        StudentActions actions = new StudentActions();
        actions.calculateTheAverageScoreInAllOfTheStudentsSubjects
                (studentValera);

    }
}



