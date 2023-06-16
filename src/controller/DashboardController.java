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

/**
 *
 * @
 */
public class DashboardController {
    DashboardModel model;
    DashboardView view;
    ResultSet rs;
    Statement stmt;

    public DashboardController(DashboardView view) {
        this.view = view;
        new DashboardListener().actionPerformed();

    }

    class DashboardListener {
        public void actionPerformed() {

        }

        public boolean checkUser(LoginModel user) throws Exception {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/app", "root", "bibhaktadon123");
            String sql = "select * from registration where username='" + user.getUsername() + "' AND password='"
                    + user.getPassword() + "'";
            try {
                stmt = conn.createStatement();
                rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    return true;
                }
                conn.close();

            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }

            return false;
        }

    }

}
