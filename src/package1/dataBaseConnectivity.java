package package1;

import java.sql.*;
import java.util.ArrayList;

public class dataBaseConnectivity {
    public static void main(String[] args) throws SQLException {
        String username = "root";
        String password = "root1234";
        String dbName = "peoplentech";
        String query = "select * from students;";

        //jdbc:mysql-->drivername
        //localhost-->host of the db
        //3306-->port number of the db
        String url = "jdbc:mysql://localhost:3306/" + dbName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        ArrayList<ArrayList<Object>> studentInformation = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String location = resultSet.getString("location");

            ArrayList<Object> student = new ArrayList<>();
            student.add(id);
            student.add(name);
            student.add(location);
            studentInformation.add(student);

        }
        System.out.println(studentInformation);

    }
}
