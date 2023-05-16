package edu.nmu.vinnik.lab4.controllers;

import edu.nmu.vinnik.lab4.models.Department;
import edu.nmu.vinnik.lab4.models.Faculty;
import edu.nmu.vinnik.lab4.models.Human;

import java.util.Collection;

public class FacultyCreator extends DepartmentCreator {
    public Faculty createFaculty(String name, Human head, Collection<Department> departments) {
        Faculty faculty = new Faculty();

        faculty.setName(name);
        faculty.setHead(head);
        faculty.setDepartments(departments);

        return faculty;
    }
}
