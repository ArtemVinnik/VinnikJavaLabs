package edu.nmu.vinnik.lab3.controllers;

import edu.nmu.vinnik.lab3.models.Faculty;
import edu.nmu.vinnik.lab3.models.Human;
import edu.nmu.vinnik.lab3.models.University;

import java.util.Collection;

public class UniversityCreator extends FacultyCreator {
    public University createUniversity(String name, Human head, Collection<Faculty> faculties) {
        University university = new University();

        university.setName(name);
        university.setHead(head);
        university.setFaculties(faculties);

        return university;
    }
}
