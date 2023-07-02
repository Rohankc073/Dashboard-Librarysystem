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
import view.DashboardView;

/**
 *
 * @author Bibhakta lamsal
 */
public class AddreturnController {
     AddreturnModel model3;
    DashboardView view;
    ResultSet rs;
    PreparedStatement pst=null;
    private String errorMessage;

    
   
    
    public  AddreturnController(DashboardView view)
        {
            
            this.view=view;
            view.addAddreturnListner(new AddreturnListener());
        }
    
        class AddreturnListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                
            model3=view.getReturn();
            if (validateAddreturn(model3)) {
                if (checkUser3(model3)) {
                    view.setMessage("Book returned Successfully"); 
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
        
        
      public boolean validateAddreturn(AddreturnModel addreturnModel) {
    // Validate username
    if (addreturnModel.getBook_id().isEmpty()) {
        errorMessage = "id is required.";
        return false;
    }

    // Validate firstname
    if (addreturnModel.getUser_id().isEmpty()) {
        errorMessage = " name is required.";
        return false;
    }

    // Validate lastname
    if (addreturnModel.getIssue_date().isEmpty()) {
        errorMessage = "phonenum is required.";
        return false;
    }

    // Validate gmail
    if (addreturnModel.getDuedate().isEmpty()) {
        errorMessage = "father name is required.";
        return false;
    }

    

    // All fields are valid
    errorMessage = null;
    return true;
}

}
       
        public boolean checkUser3(AddreturnModel user) throws Exception
        {
            try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/app", "root", "bibhaktadon123");

             String updateQuery = "UPDATE issue SET returnBook='YES' WHERE user_id='" + user.getUser_id() + "' AND book_id='" + user.getBook_id() + "'";

             if (user.getIssue_date() != null) {
                 updateQuery += " AND issueDate='" + user.getIssue_date() + "'";
             }

             if (user.getDuedate() != null) {
                 updateQuery += " AND dueDate='" + user.getDuedate() + "'";
             }

             PreparedStatement pst = conn.prepareStatement(updateQuery);
             pst.executeUpdate();

             JOptionPane.showMessageDialog(null, "Successfully returned");
             view.clearReturn();
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Connection error");
         }
          return false;
        
        }


}
