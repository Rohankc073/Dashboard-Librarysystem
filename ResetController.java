/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import model.*;
import view.*;
import java.sql.*;
public class ResetController {
    ResetModel model;
    ResetView view;
    ResultSet rs;
    Statement stmt;
    public ResetController(ResetView view)
    {
     this.view = view;
    new LoginListener().actionPerformed();
        
    }
    class LoginListener
    {
        public void actionPerformed() {
            try
            {
                model=view.getUser();
                String newPassword = model.getPassword();
                if(resetPassword(model,newPassword))
                {
                    view.setMessage("changed Successfully");
                    LoginView lv = new LoginView();
                    lv.setVisible(true);
                    view.dispose();
                }
                else
                {
                    view.setMessage("Invalid username or favorite food");
                    
                }
            }
            catch(Exception e1)
            {
                System.out.println(e1.getMessage());
            }

        }
public boolean resetPassword(ResetModel user, String newPassword) throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/app", "root", "bibhaktadon123");

    String sql = "SELECT * FROM registration WHERE username='" + user.getUsername() +  "' AND food='" + user.getFood() + "'";

    try {
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);

        if (rs.next()) {
            // User exists with the provided username, password, and food combination
            String updateSql = "UPDATE registration SET password = ? WHERE username=?";
            PreparedStatement pstmt = conn.prepareStatement(updateSql);
            pstmt.setString(1, newPassword);
            pstmt.setString(2, user.getUsername());
            pstmt.executeUpdate();
            conn.close();
            return true;
        }

        conn.close();
    } catch (Exception e2) {
        System.out.println(e2.getMessage());
    }

    return false;
}
public void clearMe(){
    
}


    }
    
}

