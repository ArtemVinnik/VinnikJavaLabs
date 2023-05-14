package edu.nmu.vinnik.lab3.controllers;

import edu.nmu.vinnik.lab3.models.Group;
import edu.nmu.vinnik.lab3.models.Human;
import edu.nmu.vinnik.lab3.models.Student;

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
