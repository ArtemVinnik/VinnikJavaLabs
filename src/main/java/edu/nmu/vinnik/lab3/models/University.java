package edu.nmu.vinnik.lab3.models;

import java.util.Collection;

public class University extends BaseAdministrationUnitEntity {
    private Collection<Faculty> faculties;

    public Collection<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(Collection<Faculty> faculties) {
        this.faculties = faculties;
    }
}
