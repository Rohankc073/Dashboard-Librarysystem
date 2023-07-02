/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.*;
import view.*;
import view.RegisterView;

/**
 *
 * @author Bibhakta lamsal
 */
public class AdduserController {
    AdduserModel model;
    DashboardView view;
    ResultSet rs;
    PreparedStatement pst=null;
    private String errorMessage;

    
   
    
    public  AdduserController(DashboardView view)
        {
            
            this.view=view;
            view.addAdduserListner(new AdduserListener());
        }
    
        class AdduserListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                
            model=view.getUser();
            if (validateAdduser(model)) {
                if (checkUser(model)) {
                    view.setMessage("Book added Successfully"); 
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
        
        
      public boolean validateAdduser(AdduserModel adduserModel) {
    // Validate username
    if (adduserModel.getUser_id().isEmpty()) {
        errorMessage = "id is required.";
        return false;
    }

    // Validate firstname
    if (adduserModel.getName().isEmpty()) {
        errorMessage = " name is required.";
        return false;
    }

    // Validate lastname
    if (adduserModel.getPhone_num().isEmpty()) {
        errorMessage = "phonenum is required.";
        return false;
    }

    // Validate gmail
    if (adduserModel.getFather_name().isEmpty()) {
        errorMessage = "father name is required.";
        return false;
    }

    // Validate phonenum
    if (adduserModel.getGmail().isEmpty()) {
        errorMessage = "gmail is required.";
        return false;
    }

    

    // All fields are valid
    errorMessage = null;
    return true;
}

}
       
        public boolean checkUser(AdduserModel user) throws Exception
        {
           
        try
          {
              
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/app","root","bibhaktadon123");
            String sql="insert into users(user_id,name,phone_num,father_name,gmail) values(?,?,?,?,?)";
            pst = conn.prepareStatement(sql);

            // String sql="select * from patient where pname='"+user.getUsername()+"' AND paddress='"+user.getPassword()+"'";
            pst.setString(1,user.getUser_id());
            pst.setString(2,user.getName());
            pst.setString(3,user.getPhone_num());
            pst.setString(4,user.getFather_name());
            pst.setString(5,user.getGmail());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"user Registered Successfully");
             view.clearMe();
          
          }
          catch(SQLException e2)
          {
              System.out.println(e2.getMessage());
          }         
            
            return false;
        }


}
