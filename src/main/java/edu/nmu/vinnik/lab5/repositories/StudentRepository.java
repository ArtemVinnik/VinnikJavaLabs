package edu.nmu.vinnik.lab5.repositories;

import edu.nmu.vinnik.lab5.models.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

public class StudentRepository {
    private static final String DB_URL = "jdbc:sqlserver://localhost\\MSSQLSERVER2022;databaseName=University;integratedSecurity=true;";

    public Collection<Student> getStudentsByMonthOfBirth(int numberOfMonth) {
        Collection<Student> students = new ArrayList<Student>();

        String query = "SELECT * FROM Students WHERE MONTH(date_of_birth) = ?";

        try {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());

            try (Connection connection = DriverManager.getConnection(DB_URL)) {
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, numberOfMonth);

                ResultSet result = preparedStatement.executeQuery();

                while (result.next()) {
                    Student student = new Student();

                    student.id = result.getObject("id", UUID.class);
                    student.surname = result.getString("surname");
                    student.name = result.getString("name");
                    student.patronymicName = result.getString("patronymic_name");
                    student.dateOfBirth = result.getDate("date_of_birth");
                    student.scoreBookId = result.getInt("score_book_id");

                    students.add(student);
                }
            }
        }
        catch (Exception ex) {

        }

        return students;
    }
}
