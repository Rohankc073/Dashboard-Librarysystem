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
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import model.*;
import view.DashboardView;

/**
 *
 * @author Bibhakta lamsal
 */
public class AdddeleteController {
    AdddeleteModel model9;
    DashboardView view;
    ResultSet rs;
    PreparedStatement pst;
    private String errorMessage;

    
   
    
    public  AdddeleteController(DashboardView view)
        {
            
            this.view=view;
            view.addAdddeleteListner(new AdddeleteListener());
        }
    
        class AdddeleteListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                
            model9=view.getDelete();
                if (checkUser30(model9)) {
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
       

public boolean checkUser30(AdddeleteModel user) throws Exception {
     try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/app", "root", "bibhaktadon123");
       String sql = "DELETE FROM users WHERE user_id='" + user.getUser_id1() + "'";
        pst = conn.prepareStatement(sql);
         pst.executeUpdate();
          JOptionPane.showMessageDialog(null,"user data deleted");
          view.clearViewuser();
          view.refreshTab();
            } 
            catch (SQLException e) {
    // Handle any exceptions here
}    return false;

}
}
