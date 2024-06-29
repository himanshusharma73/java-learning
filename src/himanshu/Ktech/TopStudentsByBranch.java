package himanshu.Ktech;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopStudentsByBranch {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/interview";
        String username = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // SQL query to select top 3 students by branch
            String sql = "SELECT id, name, marks, branch FROM student ORDER BY branch, marks DESC";
            try (PreparedStatement statement = connection.prepareStatement(sql);
                 ResultSet resultSet = statement.executeQuery()) {

                Map<String, List<Student>>  topStudent = new HashMap<>();
                while (resultSet.next()){
                    String branch=resultSet.getString("branch");
                    topStudent.putIfAbsent(branch,new ArrayList<>());
                    if (topStudent.get(branch).size()<3){
                        topStudent.get(branch).add(new Student(resultSet.getInt("id"),
                                resultSet.getString("branch"),
                                resultSet.getInt("marks")));
                    }
                }
                topStudent.forEach((branch,students) -> {
                    System.out.println("Branch "+branch);
                    students.forEach(System.out::println);
                }) ;
            }
        }
    }
}