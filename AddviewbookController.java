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
import javax.swing.table.DefaultTableModel;
import model.*;
import view.DashboardView;

/**
 *
 * @author Bibhakta lamsal
 */
public class AddviewbookController {
     AddviewbookModel model7;
    DashboardView view;
    ResultSet rs;
    PreparedStatement pst=null;
    private String errorMessage;

    
   
    
    public  AddviewbookController(DashboardView view)
        {
            
            this.view=view;
            view.addAddviewbookListner(new AddviewbookListener());
        }
    
        class AddviewbookListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                
            model7=view.getViewbook();
                if (checkUser8(model7)) {
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
       
public boolean checkUser8(AddviewbookModel user) throws Exception {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/app", "root", "bibhaktadon123");
        String sql = "SELECT * FROM books";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
            DefaultTableModel model6 = new DefaultTableModel();
            model6.addColumn("book_id");
            model6.addColumn("name1");
            model6.addColumn("writer");
            model6.addColumn("publisher");
            model6.addColumn("publish_year");

            while (rs.next()) {
                String book_id = rs.getString("book_id");
                String name1 = rs.getString("name1");
                String writer= rs.getString("writer");
                String publisher = rs.getString("publisher");
                String publish_year = rs.getString("publish_year");

                model6.addRow(new Object[]{book_id, name1, writer, publisher,publish_year});
        }

        view.setTableModel3(model6);
    } catch (SQLException e3) {
        System.out.println(e3.getMessage());
    }
    return false;
}
   public void clearMe(){
   }

      
}


