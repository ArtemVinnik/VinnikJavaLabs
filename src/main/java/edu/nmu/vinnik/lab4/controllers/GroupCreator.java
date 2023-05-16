package edu.nmu.vinnik.lab4.controllers;

import edu.nmu.vinnik.lab4.models.Group;
import edu.nmu.vinnik.lab4.models.Human;
import edu.nmu.vinnik.lab4.models.Student;

import java.util.Collection;

public class GroupCreator extends StudentCreator {
    public Group createGroup(String name, Human head, Collection<Student> students) {
        Group group = new Group();

        group.setName(name);
        group.setHead(head);
        group.setStudents(students);

        return group;
    }
}
