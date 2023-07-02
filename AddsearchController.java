//package controller;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import javax.swing.JOptionPane;
//import model.AddissuedModel;
//import model.AddsearchModel;
//import view.DashboardView;
//public class AddsearchController {
//    AddsearchModel model8;
//    DashboardView view;
//
//    public AddsearchController(DashboardView view) {
//        this.view = view;
//        view.addAddsearchListner(new AddsearchListener());
//    }
//
//    class AddsearchListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            try {
//                model8 = view.getSearch();
//                if (checkUser20(model8)) {
//                    view.setMessage("User found");
//                } else {
//                    view.setMessage("User not found");
//                }
//            } catch (Exception ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
//    }
//
//    public boolean checkUser20(AddsearchModel user10) {
//        try {
//Class.forName("com.mysql.cj.jdbc.Driver");
//         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/app", "root", "bibhaktadon123");
//            int name2 = user10.getUser_id1();
//            String sql = "SELECT * FROM users WHERE user_id = ?";
//
//            PreparedStatement pst = conn.prepareStatement(sql);
//            ResultSet rs = pst.executeQuery();
//
//            if (rs.next()) {
//                int userId = rs.getInt("user_id");
//                String phoneNum = rs.getString("phone_num");
//                String fatherName = rs.getString("father_name");
//                String gmail = rs.getString("gmail");
//
//                
//                return true; // User found
//            } else {
//                System.out.println("User not found");
//            }
//
//            rs.close();
//            pst.close();
//            conn.close();
//        } catch (SQLException | ClassNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        return false; // User not found
//    }
//
//    public void searchActionPerformed(ActionEvent evt) {
//        try {
//            model8 = view.getSearch();
//            if (checkUser20(model8)) {
//                view.setMessage("User found");
//            } else {
//                view.setMessage("User not found");
//            }
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//}
