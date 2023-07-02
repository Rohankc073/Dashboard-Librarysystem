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
public class AddissuedController {
    AddissuedModel model5;
    DashboardView view;
    ResultSet rs;
    PreparedStatement pst;
    private String errorMessage;

    
   
    
    public  AddissuedController(DashboardView view)
        {
            
            this.view=view;
            view.addAddissuedListner(new AddissuedListener());
        }
    
        class AddissuedListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                
            model5=view.getIssuedUser();
                if (checkUser6(model5)) {
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
       

public boolean checkUser6(AddissuedModel user) throws Exception {
     try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/app", "root", "bibhaktadon123");
        String sql = "SELECT issue.user_id, users.name AS user_name, issue.book_id, books.name1 AS book_name, issue.issueDate, issue.dueDate " +
             "FROM users " +
             "INNER JOIN issue ON users.user_id = issue.user_id " +
             "INNER JOIN books ON books.book_id = issue.book_id " +
             "WHERE issue.returnBook = 'No'";
         PreparedStatement pst = conn.prepareStatement(sql);

         ResultSet rs = pst.executeQuery();  // Execute the query and obtain the result set


        DefaultTableModel model3 = new DefaultTableModel();
        model3.addColumn("user_id");
        model3.addColumn("user name");
        model3.addColumn("book_id");
        model3.addColumn("book name");
        model3.addColumn("issue Date");
        model3.addColumn("due Date");

        while (rs.next()) {
            String user_id = rs.getString("user_id");
            String name = rs.getString("user_name");
            String book_id = rs.getString("book_id");
            String name1 = rs.getString("book_name");
            String issueDate = rs.getString("issueDate");
            String dueDate = rs.getString("dueDate");

            model3.addRow(new Object[]{user_id, name, book_id, name1, issueDate,dueDate});
        }

        view.setTableModel1(model3);
    } catch (SQLException e3) {
         System.out.println(e3.getMessage());
    }
    return false;

}
   
      
}
