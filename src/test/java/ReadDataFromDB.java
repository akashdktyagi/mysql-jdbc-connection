
// Adapted from http://www.vogella.com/tutorials/MySQLJava/article.html

import java.sql.*;
import java.util.Date;

public class ReadDataFromDB {

    private Connection connect = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    final private String host = "localhost:3306";
    final private String user = "root";
    final private String passwd = "root";


    public static void main(String[] args) throws Exception{
        ReadDataFromDB obj = new ReadDataFromDB();
        String query="SELECT * FROM `employees` WHERE 1";
        obj.readDataFromDB(query);
    }

    public void readDataFromDB(String query) throws Exception {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");

            // Setup the connection with the DB
            connect = DriverManager
                    .getConnection("jdbc:mysql://" + host + "/classicmodels?"
                            + "user=" + user + "&password=" + passwd );

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement
                    .executeQuery(query);
            System.out.println("id,name,email,title,code");
            int i=0;
            // ResultSet is initially before the first data set
            while (resultSet.next()) {

                // It is possible to get the columns via name
                // also possible to get the columns via the column number
                // which starts at 1
                // e.g. resultSet.getSTring(2);
                String id = resultSet.getString("employeeNumber");
                String name = resultSet.getString("firstName");
                String email = resultSet.getString("email");
                String title = resultSet.getString("jobTitle");
                String code = resultSet.getString("officeCode");

                //For Displaying the values
                i= i+1;
                System.out.print("row: " + i + "==>");
                System.out.println(id + "," + name + "," + email + "," + title + "," + code);

            }

        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }

    }

    // You need to close the resultSet
    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }

}