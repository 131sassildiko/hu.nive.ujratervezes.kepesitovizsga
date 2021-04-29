package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JurassicPark {
    private DataSource dataSource;

    public JurassicPark(DataSource datasource) {
        this.dataSource = datasource;
    }

    public List<String> checkOverpopulation(String actual, String expected) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("SELECT breed FROM dinosaur WHERE ? > ? ORDER BY breed");
        ) {
            stmt.setString(1, actual);
            stmt.setString(2, expected);


            return overpopulation(stmt);
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }
    }

    public List<String> overpopulation(PreparedStatement stmt) {
        List<String> result = new ArrayList<>();
        try (
                ResultSet rs = stmt.executeQuery();
        ) {
            while (rs.next()) {
                String name = rs.getString("name");
                result.add(name);
            }
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }
        return result;
    }





}
