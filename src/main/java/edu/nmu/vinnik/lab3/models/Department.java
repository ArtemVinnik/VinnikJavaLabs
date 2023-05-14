package edu.nmu.vinnik.lab3.models;

import java.util.Collection;

public class Department extends BaseAdministrationUnitEntity {
    private Faculty faculty;
    private Collection<Group> groups;

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Collection<Group> getGroups() {
        return groups;
    }

    public void setGroups(Collection<Group> groups) {
        this.groups = groups;
    }
}
