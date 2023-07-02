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
public class AddreturnedController {
    AddreturnedModel model6;
    DashboardView view;
    ResultSet rs;
    PreparedStatement pst;
    private String errorMessage;

    
   
    
    public  AddreturnedController(DashboardView view)
        {
            
            this.view=view;
            view.addAddreturnedListner(new AddreturnedListener());
        }
    
        class AddreturnedListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                
            model6=view.getReturnedUser();
                if (checkUser7(model6)) {
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
       

public boolean checkUser7(AddreturnedModel user) throws Exception {
     try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/app", "root", "bibhaktadon123");
        String sql = "SELECT issue.user_id, users.name AS user_name, issue.book_id, books.name1 AS book_name, issue.issueDate, issue.dueDate " +
             "FROM users " +
             "INNER JOIN issue ON users.user_id = issue.user_id " +
             "INNER JOIN books ON books.book_id = issue.book_id " +
             "WHERE issue.returnBook = 'Yes'";
         PreparedStatement pst = conn.prepareStatement(sql);

         ResultSet rs = pst.executeQuery();  // Execute the query and obtain the result set


        DefaultTableModel model4= new DefaultTableModel();
        model4.addColumn("user_id");
        model4.addColumn("user name");
        model4.addColumn("book_id");
        model4.addColumn("book name");
        model4.addColumn("issue Date");
        model4.addColumn("due Date");

        while (rs.next()) {
            String user_id = rs.getString("user_id");
            String name = rs.getString("user_name");
            String book_id = rs.getString("book_id");
            String name1 = rs.getString("book_name");
            String issueDate = rs.getString("issueDate");
            String dueDate = rs.getString("dueDate");

            model4.addRow(new Object[]{user_id, name, book_id, name1, issueDate,dueDate});
        }

        view.setTableModel2(model4);
    } catch (SQLException e3) {
         System.out.println(e3.getMessage());
    }
    return false;

}
 

}
