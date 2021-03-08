package com.epam.automation.java_error_and_exceptions;

import java.util.Map;
import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private String surname;
    private StudentFaculty faculty;
    private int group;
    private Map<StudentSubject, Integer> subject;

    public Student(int id, String name, String surname, StudentFaculty faculty,
                   int group, Map<StudentSubject, Integer> subject) {
        if (id > 0) {
            this.id = id;
        }
        if (name.matches("[A-zА-яЁё]")){
            this.name = name;
        }
        if (surname.matches("[A-zА-яЁё]")) {
            this.surname = surname;
        }
        this.faculty = faculty;
        if (group > 0 && group <= 4) {
            this.group = group;
        }
        if (subject.size() > 0) {
            this.subject = subject;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches("[A-zА-яЁё]")){
            this.name = name;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.matches("[A-zА-яЁё]")) {
            this.surname = surname;
        }
    }

    public StudentFaculty getFaculty() {
        return faculty;
    }

    public void setFaculty(StudentFaculty faculty) {
        this.faculty = faculty;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        if (group > 0 && group <= 4) {
            this.group = group;
        }
    }

    public Map<StudentSubject, Integer> getSubject() {
        return subject;
    }

    public void setSubject(Map<StudentSubject, Integer> subject) {
        if (subject.size() > 0) {
            this.subject = subject;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (group != student.group) return false;
        if (!Objects.equals(name, student.name)) return false;
        if (!Objects.equals(surname, student.surname)) return false;
        if (faculty != student.faculty) return false;
        return Objects.equals(subject, student.subject);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (faculty != null ? faculty.hashCode() : 0);
        result = 31 * result + group;
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", faculty=").append(faculty);
        sb.append(", group=").append(group);
        sb.append(", subject=").append(subject);
        sb.append('}');
        return sb.toString();
    }
}
