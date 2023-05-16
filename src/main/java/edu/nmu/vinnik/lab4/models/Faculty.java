package edu.nmu.vinnik.lab4.models;

import java.util.Collection;

public class Faculty extends BaseAdministrationUnitEntity {
    private University university;
    private Collection<Department> departments;

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Collection<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Collection<Department> departments) {
        this.departments = departments;
    }
}
