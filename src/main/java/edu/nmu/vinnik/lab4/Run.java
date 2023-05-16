package edu.nmu.vinnik.lab4;

import edu.nmu.vinnik.lab4.controllers.UniversityCreator;
import edu.nmu.vinnik.lab4.models.*;

import java.util.ArrayList;
import java.util.Collection;

public class Run {
    public University createTypicalUniversity() {
        UniversityCreator universityCreator = new UniversityCreator();

        Collection<Student> students = createStudents(universityCreator);
        Collection<Human> heads = getHumans();
        Collection<Group> groups = new ArrayList<Group>();
        Collection<Department> departments = new ArrayList<Department>();
        Collection<Faculty> faculties = new ArrayList<Faculty>();

        Group group = universityCreator.createGroup("122-20-3", (Human)heads.toArray()[0], students);
        groups.add(group);

        Department department = universityCreator.createDepartment(
                "Department of software and computer systems",
                (Human)heads.toArray()[1],
                groups
        );
        departments.add(department);

        Faculty faculty = universityCreator.createFaculty(
                "Faculty of information technologies",
                (Human)heads.toArray()[2],
                departments
        );
        faculties.add(faculty);

        University university = universityCreator.createUniversity(
                "Dnipro University of Technology",
                (Human)heads.toArray()[3],
                faculties
        );

        return university;
    }

    private Human createHuman(int number) {
        String name = "Name";
        String surname = "Surname";
        String patronymicName = "PatronymicName";
        int gender = (number + 1) % 2;

        Human human = new Human();

        human.setName(name + number);
        human.setSurname(surname + number);
        human.setPatronymicName(patronymicName + number);
        human.setGender(Gender.values()[gender]);

        return human;
    }

    private Collection<Human> getHumans() {
        Collection<Human> humans = new ArrayList<Human>();

        for (int i = 0; i < 10; i++) {
            humans.add(createHuman(i));
        }

        return humans;
    }
    
    private Collection<Student> createStudents(UniversityCreator universityCreator) {
        Collection<Student> students = new ArrayList<Student>();
        
        Collection<Human> humans = getHumans();

        for (Human human: humans) {
            students.add(universityCreator.createStudent(
                    human.getName(),
                    human.getSurname(),
                    human.getPatronymicName(),
                    human.getGender()
            ));
        }
        
        return students;
    }
}
