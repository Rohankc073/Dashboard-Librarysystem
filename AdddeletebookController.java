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
public class AdddeletebookController {
    AdddeletebookModel model10;
    DashboardView view;
    ResultSet rs;
    PreparedStatement pst;
    private String errorMessage;

    
   
    
    public  AdddeletebookController(DashboardView view)
        {
            
            this.view=view;
            view.addAdddeletebookListner(new AddbookdeleteListener());
        }
    
        class AddbookdeleteListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                
            model10=view.getDelete1();
                if (checkUser40(model10)) {
                    view.setMessage("Book added Successfully"); 
                } 
           else {
                view.setMessage("Validation Error: " + errorMessage);
            }


            }
            catch(Exception e1)
            {
               System.out.println(e1.getMessage());
            }

        }
        


}
       

public boolean checkUser40(AdddeletebookModel user) throws Exception {
     try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/app", "root", "bibhaktadon123");
       String sql = "DELETE FROM books WHERE book_id='" + user.getUser_id5() + "'";
        pst = conn.prepareStatement(sql);
         pst.executeUpdate();
          JOptionPane.showMessageDialog(null,"Data deleted");
         view.clearViewbook();
         view.refreshTab2();
            } 
            catch (SQLException e) {
    // Handle any exceptions here
}    return false;
}
}

