package edu.nmu.vinnik.lab5.services;

import edu.nmu.vinnik.lab5.models.Student;
import edu.nmu.vinnik.lab5.repositories.StudentRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class StudentService {
    public void displayStudentsByMonth() {
        int numberOfMonth = 0;
        Collection<Student> students;

        StudentRepository studentRepository = new StudentRepository();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of month:");
        System.out.println();
        System.out.println("January\t-\t1");
        System.out.println("February\t-\t2");
        System.out.println("March\t-\t3");
        System.out.println("April\t-\t4");
        System.out.println("May\t-\t5");
        System.out.println("June\t-\t6");
        System.out.println("July\t-\t7");
        System.out.println("August\t-\t8");
        System.out.println("September\t-\t9");
        System.out.println("October\t-\t10");
        System.out.println("November\t-\t11");
        System.out.println("December\t-\t12");

        while (true) {
            if (scanner.hasNextInt()){
                numberOfMonth = scanner.nextInt();

                if (numberOfMonth >= 1 && numberOfMonth <= 12) {
                    students = studentRepository.getStudentsByMonthOfBirth(numberOfMonth);
                    break;
                }
                else {
                    System.out.println("Input correct number");
                }
            }
        }

        displayStudents(students);
    }

    private void displayStudents(Collection<Student> students) {
        System.out.println();
        System.out.println("id\tsurname\tname\tpatronymic_name\tdate_of_birth\tscore_book_id");

        for (Student student: students) {
            System.out.println(
                    student.id + "\t" +
                    student.surname + "\t" +
                    student.patronymicName + "\t" +
                    student.dateOfBirth + "\t" +
                    student.scoreBookId
                    );
        }
    }
}
