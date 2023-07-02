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
import java.awt.event.*;

/**
 *
 * @author Bibhakta lamsal
 */
public class LoginController {
    LoginModel model;
    LoginView view;
    ResultSet rs;
    Statement stmt;
    private String errorMessage;
    public LoginController(LoginView view)
    {
        this.view=view;
        view.addLoginListener(new LoginListener());
        
    }
    class LoginListener  implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                model=view.getUser();
                 if (validateLogin(model)) {
                if(checkUser(model))
                {
                    view.setMessage("Login Successfully");
                        DashboardView dv = new DashboardView();
                        dv.setVisible(true);
                         view.dispose();
                }
                 }else
                {
                    view.setMessage("Invalid username or password");
                    
                }
            }
            catch(Exception e1)
            {
                System.out.println(e1.getMessage());
            }

        }
              public boolean validateLogin(LoginModel lModel) {
                // Validate username
                if (lModel.getUsername().isEmpty()) {
                    errorMessage = "Username is required.";
                    return false;
                }
                if (lModel.getPassword().isEmpty()) {
                    errorMessage = "Password and confirm password are required.";
                    return false;
                }
                // All fields are valid
                errorMessage = null;
                return true;
            }
    }
        public boolean checkUser(LoginModel user) throws Exception
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
               Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/app","root","bibhaktadon123");
          String sql="select * from registration where username='"+user.getUsername()+"' AND password='"+user.getPassword()+"'";
          try
          {
            stmt=conn.createStatement();
             rs=stmt.executeQuery(sql);
             if(rs.next())
             {
                 return true;
             }
             conn.close();
            
          
          }
          catch(SQLException e2)
          {
              System.out.println(e2.getMessage());
          }         
            
            return false;
        }
        
}
