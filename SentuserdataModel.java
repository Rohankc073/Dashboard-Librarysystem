/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Bibhakta lamsal
 */
public class SentuserdataModel {
    @SuppressWarnings("CallToPrintStackTrace")
    public List<AddsearchModel> getSupplierData(String username) throws ClassNotFoundException {
        List<AddsearchModel> supplierList = new ArrayList<>();
        try {
          Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/app", "root", "bibhaktadon123");
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE user_id = ?");
            stmt.setString(1, username);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String name = rs.getString("name");
                    String phone = rs.getString("phone_num");
                    String father = rs.getString("father_name");
                    String gmail = rs.getString("gmail");
                    AddsearchModel supplier = new AddsearchModel(name, phone, father, gmail);
                    supplierList.add(supplier);
                }
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return supplierList;
    }
}
