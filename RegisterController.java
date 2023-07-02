/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;
import model.*;
import view.*;
/**
 *
 * @author Bibhakta lamsal
 * 
 * 
 
 */

public class RegisterController {
    RegisterModel model;
    RegisterView view;
    ResultSet rs;
    PreparedStatement pst=null;
     private String errorMessage;

    
   
    
    public  RegisterController(RegisterView view)
        {
            
            this.view=view;
            view.addRegisterListner(new RegisterListener());
        }
    
        class RegisterListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                
            model=view.getUser();
            if (validateRegistration(model)) {
                if (checkUser(model)) {
                    view.setMessage("Registered Successfully"); 
                } 
            } else {
                view.setMessage("Validation Error: " + errorMessage);
            }


            }
            catch(Exception e1)
            {
               System.out.println(e1.getMessage());
            }

        }
        
        
      public boolean validateRegistration(RegisterModel registerModel) {
    // Validate username
    if (registerModel.getUsername().isEmpty()) {
        errorMessage = "Username is required.";
        return false;
    }

    // Validate firstname
    if (registerModel.getFirstname().isEmpty()) {
        errorMessage = "First name is required.";
        return false;
    }

    // Validate lastname
    if (registerModel.getLastname().isEmpty()) {
        errorMessage = "Last name is required.";
        return false;
    }

    // Validate gmail
    if (registerModel.getGmail().isEmpty()) {
        errorMessage = "Email is required.";
        return false;
    }

    // Validate phonenum
    if (registerModel.getPhonenum().isEmpty()) {
        errorMessage = "Phone number is required.";
        return false;
    }

    // Validate food
    if (registerModel.getFood().isEmpty()) {
        errorMessage = "Favorite food is required.";
        return false;
    }

    // Validate password and confirm password
    String password = registerModel.getPassword();
    String confirmPassword = registerModel.getConfirmpassword();

    if (password.isEmpty() || confirmPassword.isEmpty()) {
        errorMessage = "Password and confirm password are required.";
        return false;
    }

    if (!password.equals(confirmPassword)) {
        errorMessage = "Password and confirm password do not match.";
        return false;
    }

    // All fields are valid
    errorMessage = null;
    return true;
}

}
       
        public boolean checkUser(RegisterModel user) throws Exception
        {
           
        try
          {
              
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/app","root","bibhaktadon123");
            String sql="insert into registration(username,firstname,lastname,gmail,phonenum,food,password,confirmpassword) values(?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);

            // String sql="select * from patient where pname='"+user.getUsername()+"' AND paddress='"+user.getPassword()+"'";
            pst.setString(1,user.getUsername());
            pst.setString(2,user.getFirstname());
            pst.setString(3,user.getLastname());
            pst.setString(4,user.getGmail());
            pst.setString(5,user.getPhonenum());
            pst.setString(6,user.getFood());
            pst.setString(7,user.getPassword());
            pst.setString(8,user.getConfirmpassword());
            pst.executeUpdate();
                    System.out.println("Data inserted");
            JOptionPane.showMessageDialog(null,"Data Registered Successfully");
            LoginView lv = new LoginView();
        lv.setVisible(true);
        view.dispose();
          
          }
          catch(SQLException e2)
          {
              System.out.println(e2.getMessage());
          }         
            
            return false;
        }

      
}
