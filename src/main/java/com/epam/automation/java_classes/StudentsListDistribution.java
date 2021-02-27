package com.epam.automation.java_classes;

import java.util.Arrays;

public class StudentsListDistribution {

    public void printListOfStudents(Student[] students) {
        System.out.println("List of all students : ");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void listOfStudentsOfAGivenFaculty(Student[] students, FacultyType faculty) {
        System.out.println("List of all students of a " + faculty + " faculty : ");
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                System.out.println(student.getName() + " " + student.getSurname() +
                        " " + student.getPatronymic());
            } else {
                System.out.println("Student " + student.getName() + " " + student.getSurname() +
                        " " + student.getPatronymic() + " does not study at this faculty ");
            }
        }
    }

    public void listOfStudentsForEachCourse(Student[] students) {
        System.out.println("List of students for each course :");
        for (Student student : students) {
            if (student.getCourse() == 1) {
                System.out.println("Student of 1 course is " + student.getName() + " " + student.getSurname() +
                        " " + student.getPatronymic());
            } else if (student.getCourse() == 2) {
                System.out.println("Student of 2 course is " + student.getName() + " " + student.getSurname() +
                        " " + student.getPatronymic());
            } else if (student.getCourse() == 3) {
                System.out.println("Student of 3 course is " + student.getName() + " " + student.getSurname() +
                        " " + student.getPatronymic());
            } else if (student.getCourse() == 4) {
                System.out.println("Student of 4 course is " + student.getName() + " " + student.getSurname() +
                        " " + student.getPatronymic());
            }
        }
    }

    public void listOfStudentsForEachFaculty(Student[] students) {
        System.out.println("List of students for each faculty :");
        for (Student nextStudent : students) {
            if (nextStudent.getFaculty() == FacultyType.MMF) {
                System.out.println("Student of " + FacultyType.MMF + " is " + nextStudent.getName() + " " + nextStudent.getSurname() +
                        " " + nextStudent.getPatronymic());
            }
            if (nextStudent.getFaculty() == FacultyType.INTERNATIONAL_RELATIONS) {
                System.out.println("Student of " + FacultyType.INTERNATIONAL_RELATIONS + " is " + nextStudent.getName() + " " + nextStudent.getSurname() +
                        " " + nextStudent.getPatronymic());
            }
            if (nextStudent.getFaculty() == FacultyType.LINGUISTIC) {
                System.out.println("Student of " + FacultyType.LINGUISTIC + " is " + nextStudent.getName() + " " + nextStudent.getSurname() +
                        " " + nextStudent.getPatronymic());
            }
        }
    }


    public void listOfStudentsByGroup(Student[] students, String group) {
        System.out.println("List of students by " + group + " :");
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                System.out.println(student.getName() + " " + student.getSurname() +
                        " " + student.getPatronymic());
            } else {
                System.out.println("Student " + student.getName() + " " + student.getSurname() +
                        " " + student.getPatronymic() + " does not study at " + group
                        + " this group ");
            }
        }
    }

    public void listOfStudentsBornAfterAGivenYear(Student[] students, int year) {
        System.out.println("List of students who born after " + year + " :");
        for (Student student : students) {
            String birthYear = student.getDateOfBirth();
            String birth = Arrays.toString(birthYear.split("(0[1-9]|[12][0-9]|3[01])[- /.]" +
                    "(0[1-9]|1[012])[- /.]")).replaceAll("[,()<\\[\\]>]", "").trim();
            if (Integer.parseInt(birth) >= year) {
                System.out.println(student.getName() + " " + student.getSurname() +
                        " " + student.getPatronymic());
            }
        }
    }
}
