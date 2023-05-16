package edu.nmu.vinnik.lab4.models;

import java.util.Collection;

public class Group extends BaseAdministrationUnitEntity {
    private Department department;
    private Collection<Student> students;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Collection<Student> getStudents() {
        return students;
    }

    public void setStudents(Collection<Student> students) {
        this.students = students;
    }
}
