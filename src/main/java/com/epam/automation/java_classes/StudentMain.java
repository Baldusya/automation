package com.epam.automation.java_classes;


import static com.epam.automation.java_classes.FacultyType.*;

public class StudentMain {

    public static void main(String[] args) {
        Student student = new Student(1, "Volodya", "Pupkin", "Olegovich",
                "01.02.1993", "Belarus, Minsk, Pushkina 1-2",
                298822822, INTERNATIONAL_RELATIONS, 2, "34M");
        Student nextStudent = new Student(2, "Valera", "Popkin",
                "Ivanovich", "02.01.1997", "Belarus, Minsk, Masherova 3-2",
                298924822, LINGUISTIC, 4, "25G");
        Student[] students = new Student[2];
        students[0] = student;
        students[1] = nextStudent;
        StudentsListDistribution distribution = new StudentsListDistribution();
        distribution.printListOfStudents(students);
        distribution.listOfStudentsOfAGivenFaculty(students, INTERNATIONAL_RELATIONS);
        distribution.listOfStudentsForEachFaculty(students);
        distribution.listOfStudentsForEachCourse(students);
        distribution.listOfStudentsByGroup(students, "34M");
        distribution.listOfStudentsBornAfterAGivenYear(students, 1995);

    }
}
