package Classes;
import SQL.*;
import SQL.DataBaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MealDAO {

    // Fetch all meals from the FOODMENU table
    public static List<Meal> fetchMeals() {
        List<Meal> meals = new ArrayList<>();
        String sql = "SELECT ITEMID, ITEMNAME, ITEMTYPE, ITEMPRICE FROM FOODMENU";

        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                int itemID = rs.getInt("ITEMID");
                String itemName = rs.getString("ITEMNAME");
                String itemType = rs.getString("ITEMTYPE");
                int itemPrice = rs.getInt("ITEMPRICE");

                Meal meal = new Meal(itemID, itemName, itemType, itemPrice);
                meals.add(meal);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return meals;
    }

    // Fetch a single meal by itemID
    public static Meal fetchMealById(int itemID) {
        String sql = "SELECT ITEMID, ITEMNAME, ITEMTYPE, ITEMPRICE FROM FOODMENU WHERE ITEMID = ?";

        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, itemID);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new Meal(
                        rs.getInt("ITEMID"),
                        rs.getString("ITEMNAME"),
                        rs.getString("ITEMTYPE"),
                        rs.getInt("ITEMPRICE")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
