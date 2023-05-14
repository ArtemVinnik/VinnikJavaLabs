package edu.nmu.vinnik.lab3.controllers;

import edu.nmu.vinnik.lab3.models.Department;
import edu.nmu.vinnik.lab3.models.Group;
import edu.nmu.vinnik.lab3.models.Human;

import java.util.Collection;

public class DepartmentCreator extends GroupCreator {
    public Department createDepartment(String name, Human head, Collection<Group> groups) {
        Department department = new Department();

        department.setName(name);
        department.setHead(head);
        department.setGroups(groups);

        return department;
    }
}
