import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = null;
        DataSource dataSource = new DataSource("src/main/resources/database.properties");
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement("SELECT name, age, sex, animal FROM zoo")
        ) {
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    zoo = new Zoo();
                    zoo.setAge(resultSet.getInt("age"));
                    zoo.setAnimal(resultSet.getString("animal"));
                    zoo.setAnimalName(resultSet.getString("name"));
                    zoo.setSex(resultSet.getString("sex").charAt(0));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(zoo);
    }
}
