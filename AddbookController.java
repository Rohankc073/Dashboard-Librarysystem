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
public class AddbookController {
    AddbookModel model1;
    DashboardView view;
    ResultSet rs;
    PreparedStatement pst=null;
    private String errorMessage;

    
   
    
    public  AddbookController(DashboardView view)
        {
            
            this.view=view;
            view.addAddbookListner(new AddbookListener());
        }
    
        class AddbookListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                
            model1=view.getBook();
            if (validateAddbook(model1)) {
                if (checkUser1(model1)) {
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
        
        
      public boolean validateAddbook(AddbookModel addbookModel) {
    // Validate username
    if (addbookModel.getBook_id().isEmpty()) {
        errorMessage = "id is required.";
        return false;
    }

    // Validate firstname
    if (addbookModel.getName1().isEmpty()) {
        errorMessage = " name is required.";
        return false;
    }

    // Validate lastname
    if (addbookModel.getWriter().isEmpty()) {
        errorMessage = "phonenum is required.";
        return false;
    }

    // Validate gmail
    if (addbookModel.getPublisher().isEmpty()) {
        errorMessage = "father name is required.";
        return false;
    }

    // Validate phonenum
    if (addbookModel.getPublish_year().isEmpty()) {
        errorMessage = "gmail is required.";
        return false;
    }

    

    // All fields are valid
    errorMessage = null;
    return true;
}

}
       
        public boolean checkUser1(AddbookModel user) throws Exception
        {
           
        try
          {
              
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/app","root","bibhaktadon123");
            String sql="insert into books(book_id,name1,writer,publisher,publish_year) values(?,?,?,?,?)";
            pst = conn.prepareStatement(sql);

            // String sql="select * from patient where pname='"+user.getUsername()+"' AND paddress='"+user.getPassword()+"'";
            pst.setString(1,user.getBook_id());
            pst.setString(2,user.getName1());
            pst.setString(3,user.getWriter());
            pst.setString(4,user.getPublisher());
            pst.setString(5,user.getPublish_year());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Registered Successfully");
            view.clearMeBook();
          
          }
          catch(SQLException e2)
          {
              System.out.println(e2.getMessage());
          }         
            
            return false;
        }
   public void clearMe(){
   }

}
