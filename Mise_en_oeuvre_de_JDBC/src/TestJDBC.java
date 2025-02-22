import java.sql.*;

public class TestJDBC {
    public static void main(String[] args) throws Exception {
        // Load PostgreSQL JDBC driver
        Class.forName("org.postgresql.Driver");
        
        // Establish connection to the PostgreSQL database
        Connection cx = DriverManager.getConnection(
            "jdbc:postgresql://localhost:5433/test1", "postgres", "app");
        
        // Create a statement object
        Statement st = cx.createStatement();
        
        // Execute SQL query to retrieve data
        ResultSet rs = st.executeQuery("SELECT * FROM employees");
        
        // Process the result set
        while (rs.next()) {
            String name = rs.getString("name");
            int age = rs.getInt("age");
            System.out.println(name + " is " + age + " years old");
        }
        
        // Close the resources
        rs.close();
        st.close();
        cx.close();
    }
}
