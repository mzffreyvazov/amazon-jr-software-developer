package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.ArrayList;
import java.sql.CallableStatement;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/personal_task_manager";
        String username = "springstudent";
        String password = "springstudent";
        Scanner scanner = new Scanner(System.in);
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");
            System.out.println("Fetching data from the database...");
            System.out.println("-------------------------------------\n");


            Statement statement = connection.createStatement();
            String sqlQuery = "SELECT name, description FROM task_table"; 
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            int count = 0;
            while (resultSet.next() && count < 2) {
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");
                System.out.println("Name: " + name + "\nDescription: " + description);
                System.out.println();
                count++;
            }


            System.out.println("-------------------------------------\n");
            System.out.println("Parameterized query example");
            System.out.println();

            count = 0;
            String sqlQuery2 = "SELECT name, description FROM task_table WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery2);
            System.out.println("Enter the id of the task you want to fetch: ");
            int id = scanner.nextInt();
            preparedStatement.setInt(1, id);
            ResultSet resultSet2 = preparedStatement.executeQuery();

            while (resultSet2.next() && count < 2) {
                String name = resultSet2.getString("name");
                String description = resultSet2.getString("description");
                System.out.println("Name: " + name + "\nDescription: " + description);
                System.out.println();
                count++;
            }


            System.out.println("-------------------------------------\n");
            System.out.println("Callable statement example");
            System.out.println();

            // first create a stored procedure in the database
            String createProcedure = 
                "DELIMITER $$\n" +
                "CREATE PROCEDURE get_task_by_id(IN taskId INT)\n" +
                "BEGIN\n" +
                "    SELECT id, name, description FROM task_table WHERE id = taskId;\n" +
                "END $$\n" +
                "DELIMITER ;";

            try (Statement stmt = connection.createStatement()) {
                stmt.execute(createProcedure);
                System.out.println("Stored procedure 'get_task_by_id' created successfully!");
            } catch (SQLException e) {
                System.out.println("Could not create stored procedure (it may already exist).");
                // e.printStackTrace(); // Uncomment for debugging
            }

            // Now call the stored procedure
            CallableStatement callableStatement = connection.prepareCall("{CALL get_task_by_id(?)}");
            System.out.println("Enter the id of the task you want to fetch: ");
            int taskId = scanner.nextInt();
            callableStatement.setInt(1, taskId);
            ResultSet resultSet3 = callableStatement.executeQuery();
            count = 0;
            while (resultSet3.next() && count < 2) {
                int id2 = resultSet3.getInt("id");
                String name = resultSet3.getString("name");
                String description = resultSet3.getString("description");
                System.out.println("ID: " + id2 + "\nName: " + name + "\nDescription: " + description);
                System.out.println();
                count++;
            }
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        } finally {
            scanner.close();
        }

    }
}
