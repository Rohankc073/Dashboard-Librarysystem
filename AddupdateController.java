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
public class AddupdateController {
     AddupdateModel model11;
    DashboardView view;
    ResultSet rs;
    PreparedStatement pst;
    private String errorMessage;

    
   
    
    public  AddupdateController(DashboardView view)
        {
            
            this.view=view;
            view.addAddupdateListner(new AddupdateListener());
        }
    
        class AddupdateListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                
            model11=view.getUpdate();
                if (checkupdate(model11)) {
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
       

public boolean checkupdate(AddupdateModel user) throws Exception {
     try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/app", "root", "bibhaktadon123");
        String sql = "UPDATE users SET name='" + user.getName2() + "', phone_num='" + user.getPhone_num3() +
                "', father_name='" + user.getFather_name4() + "', gmail='" + user.getGmail4()+"' WHERE user_id='"+user.getUser_id1()+"'";
        pst = conn.prepareStatement(sql);
         pst.executeUpdate();
          JOptionPane.showMessageDialog(null,"Data update");
          view.clearViewuser();
          view.refreshTab();
            } 
            catch (SQLException e) {
    // Handle any exceptions here
}    return false;
}
}

