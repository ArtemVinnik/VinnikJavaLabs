package edu.nmu.vinnik.lab4.controllers;

import edu.nmu.vinnik.lab4.models.Gender;
import edu.nmu.vinnik.lab4.models.Student;

public class StudentCreator {
    public Student createStudent(String name, String surname, String patronymicName, Gender gender) {
        Student student = new Student();

        student.setName(name);
        student.setSurname(surname);
        student.setPatronymicName(patronymicName);
        student.setGender(gender);

        return student;
    }
}
