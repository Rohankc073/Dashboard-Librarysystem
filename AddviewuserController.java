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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bibhakta lamsal
 */
public class AddviewuserController {
    AddviewuserModel model4;
    DashboardView view;
    ResultSet rs;
    PreparedStatement pst=null;
    private String errorMessage;

    
   
    
    public  AddviewuserController(DashboardView view)
        {
            
            this.view=view;
            view.addAddviewuserListner(new AddviewuserListener());
        }
    
        class AddviewuserListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                
            model4=view.getViewuser();
                if (checkUser5(model4)) {
                    view.setMessage("resut of issue Successfully"); 
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
       
public boolean checkUser5(AddviewuserModel user) throws Exception {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/app", "root", "bibhaktadon123");
        String sql = "SELECT * FROM users";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        DefaultTableModel model2 = new DefaultTableModel();
        model2.addColumn("user_id");
        model2.addColumn("name");
        model2.addColumn("phone_num");
        model2.addColumn("father_name");
        model2.addColumn("gmail");

        while (rs.next()) {
            String user_id = rs.getString("user_id");
            String name = rs.getString("name");
            String phone_num = rs.getString("phone_num");
            String father_name = rs.getString("father_name");
            String gmail = rs.getString("gmail");

            model2.addRow(new Object[]{user_id, name, phone_num, father_name, gmail});
        }

        view.setTableModel(model2);
    } catch (SQLException e4) {
         System.out.println(e4.getMessage());
    }
    return false;
}
   public void clearMe(){
   }

      
}

