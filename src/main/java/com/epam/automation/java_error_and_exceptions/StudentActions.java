package com.epam.automation.java_error_and_exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentActions {
    public int calculateTheAverageScoreInAllOfTheStudentsSubjects
            (Student student){
        Map<StudentSubject, Integer> subjects = student.getSubject();
        //System.out.println(subjects);
        ArrayList<Integer> rating = new ArrayList<>(subjects.values());
        //System.out.println(rating);
        int averageScore = 0;
        //System.out.println("Average score in all of the students subjects is "
      //          + averageScore);
        return averageScore;
    }
    public int calculateTheAverageScoreForASpecificSubjectInASpecificGroup
            (StudentSubject subject, int group){
        int averageScore = 0;
        return averageScore;
    }
    public int calculateTheAverageScoreForASpecificSubjectInASpecificFaculty
            (StudentSubject subject, StudentFaculty faculty){
        int averageScore = 0;
        return averageScore;
    }
    public int calculateTheAverageScoreInASubjectForTheEntireUniversity
            (StudentSubject subject, List<Student> students) {
        int averageScore = 0;
        return averageScore;
    }
}
