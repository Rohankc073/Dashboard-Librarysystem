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
public class AddupdatebookController {
      AddupdatebookModel model12;
    DashboardView view;
    ResultSet rs;
    PreparedStatement pst;
    private String errorMessage;

    
   
    
    public  AddupdatebookController(DashboardView view)
        {
            
            this.view=view;
            view.addAddupdatebookListner(new AddupdatebookListener());
        }
    
        class AddupdatebookListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                
            model12=view.getUpdate1();
                if (checkupdate(model12)) {
                    view.setMessage(""); 
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
       

public boolean checkupdate(AddupdatebookModel user) throws Exception {
     try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/app", "root", "bibhaktadon123");
        String sql = "UPDATE books SET name1='" + user.getName5() + "', writer='" + user.getPhone_num5() +
                "', publisher='" + user.getFather_name5()+ "', publish_year='" + user.getGmail5()+"' WHERE book_id='"+user.getUser_id5()+"'";
        pst = conn.prepareStatement(sql);
         pst.executeUpdate();
          JOptionPane.showMessageDialog(null,"Data updated");
          view.clearViewbook();
          view.refreshTab2();
            } 
            catch (SQLException e) {
    // Handle any exceptions here
}    return false;
}
}
