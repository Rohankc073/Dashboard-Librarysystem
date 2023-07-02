/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.sun.nio.sctp.SendFailedNotification;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import  controller.*;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.*;



/**
 *
 * @author 
 */
public class DashboardView extends javax.swing.JFrame {
    Connection conn;
    Statement stmt;
    AdduserModel model;
    AddsearchModel model8;
    AdduserController r;
    AddbookController b;
    AddissueController i;
    AddreturnController re;
    AddviewuserController vu;
    AddissuedController ic;
    AddreturnedController rc;
    AddviewbookController vb;
   // AddsearchController s;
    AdddeleteController dd;
    AdddeletebookController ddb;
    AddupdateController uu;
    AddupdatebookController ub;
    AddbookModel model1;
    AddissueModel model2;
    AddreturnModel model3;
    AddviewuserModel model4;
    AddissuedModel model5;
     AddreturnedModel model6;
    AddviewbookModel model7;
    AdddeleteModel model9;
    AdddeletebookModel model10;
    AddupdateModel model11;
    AddupdatebookModel model12;
    /**
     * Creates new form dashboardPage
     */
    public DashboardView() {
        initComponents();
    }
    
    //for add user
      public AdduserModel getUser()
{
    model=new AdduserModel(txtuserid.getText(),txtname.getText(),txtphone.getText(),txtfather.getText(),txtgmail.getText());
    return model;
}
      
      
      //for add book
   public AddbookModel getBook()
{
    model1=new AddbookModel(txtbookid.getText(),txtname2.getText(),txtwritter.getText(),txtpublisher.getText(),txtdate.getText());
    return model1;
}
   
   //for issue book
     public AddissueModel getIssue()
{
      
      String returnBook = "No";
    model2=new AddissueModel(txtbookid2.getText(),txtuserid2.getText(),txtissue.getText(),txtdue.getText(),returnBook = "No");
    return model2;
}
     
   //for return book
     public AddreturnModel getReturn()
{
       String returnBook = "No";
    model3=new AddreturnModel(txtbookreturn.getText(),txtuserreturn.getText(),txtissuereturn.getText(),txtduereturn.getText(),returnBook = "No");
    return model3;
}
     
     //for View user 
     
     public AddviewuserModel getViewuser() {
    DefaultTableModel model2 = new DefaultTableModel();
    model4 = new AddviewuserModel(txtuserid.getText(), txtname.getText(), txtphone.getText(), txtfather.getText(), txtgmail.getText(), model2);
    return model4;
}

public void setTableModel(DefaultTableModel model) {
    txttable.setModel(model);
}

//for issued book
public AddissuedModel getIssuedUser() {
    DefaultTableModel model3 = new DefaultTableModel();
    
    model5 = new AddissuedModel(txtuserid.getText(), txtname.getText(), txtbookid.getText(), txtname2.getText(),
    txtissue.getText(),txtdue.getText(), model3);
    return model5;
}

public void setTableModel1(DefaultTableModel model1) {
    issuetable.setModel(model1);
}


//for returned book
public AddreturnedModel getReturnedUser() {
    DefaultTableModel model4 = new DefaultTableModel();
    
    model6 = new AddreturnedModel(txtuserid.getText(), txtname.getText(), txtbookid.getText(), txtname2.getText(),
    txtissue.getText(),txtdue.getText(), model4);
    return model6;
}

public void setTableModel2(DefaultTableModel model2) {
    issuetable1.setModel(model2);
}




    //for View book 
public AddviewbookModel getViewbook() {
    DefaultTableModel model6 = new DefaultTableModel();
    model7= new AddviewbookModel(txtbookid.getText(), txtname2.getText(), txtwritter.getText(), txtpublisher.getText(), txtdate.getText(), model6);
    return model7;
}

public void setTableModel3(DefaultTableModel model3) {
    booktable.setModel(model3);
}

     
// //for search user
//public AddsearchModel getSearch() {
//    int id = Integer.parseInt(txtID.getText());
//  
//    model8 = new AddsearchModel(id);
//    return model8;
//}
   
   // for delete user
      public AdddeleteModel getDelete() {
        model9= new AdddeleteModel(txtID.getText(), txtname1.getText(), txtphone1.getText(), txtfather1.getText(), txtgmail1.getText());
        return model9;
}
      
  // for delete book
      public AdddeletebookModel getDelete1() {
        model10= new AdddeletebookModel(txtID5.getText(), txtname7.getText(), txtwriter.getText(), txtpublisher2.getText(), txtpublishdate.getText());
        return model10;
} 
      
  // for update user
      public AddupdateModel getUpdate() {
        model11= new AddupdateModel(txtID.getText(), txtname1.getText(), txtphone1.getText(), txtfather1.getText(), txtgmail1.getText());
        return model11;
} 
   
      // for update book
      public AddupdatebookModel getUpdate1() {
        model12= new AddupdatebookModel(txtID5.getText(), txtname7.getText(), txtwriter.getText(), txtpublisher2.getText(), txtpublishdate.getText());
        return model12;
} 
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        btndashboard = new javax.swing.JButton();
        btnadduser = new javax.swing.JButton();
        btnaddbook = new javax.swing.JButton();
        btnviewuser = new javax.swing.JButton();
        btnviewbook = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnissuebook = new javax.swing.JButton();
        btnissuedbook = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        btnissuedbook1 = new javax.swing.JButton();
        btnreturned = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        labelaccount = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        totalbook = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        totaluser = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        totalissue = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        totalreturn = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtuserid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtfather = new javax.swing.JTextField();
        txtgmail = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtbookid = new javax.swing.JTextField();
        txtname2 = new javax.swing.JTextField();
        txtwritter = new javax.swing.JTextField();
        txtpublisher = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        btnsavebook = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txttable = new javax.swing.JTable();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtname1 = new javax.swing.JTextField();
        txtphone1 = new javax.swing.JTextField();
        txtfather1 = new javax.swing.JTextField();
        txtgmail1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        booktable = new javax.swing.JTable();
        jPanel23 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        txtname7 = new javax.swing.JTextField();
        txtwriter = new javax.swing.JTextField();
        txtpublisher2 = new javax.swing.JTextField();
        txtpublishdate = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        txtID5 = new javax.swing.JTextField();
        btnsearch5 = new javax.swing.JButton();
        btnclear5 = new javax.swing.JButton();
        btnupdate1 = new javax.swing.JButton();
        btndelete1 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtbookid2 = new javax.swing.JTextField();
        txtuserid2 = new javax.swing.JTextField();
        btnissue = new javax.swing.JButton();
        txtissue = new javax.swing.JTextField();
        txtdue = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        btnreturn = new javax.swing.JButton();
        btnsearch2 = new javax.swing.JButton();
        txtbookreturn = new javax.swing.JTextField();
        txtuserreturn = new javax.swing.JTextField();
        txtissuereturn = new javax.swing.JTextField();
        txtduereturn = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        issuetable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        btnprint = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        issuetable1 = new javax.swing.JTable();
        jLabel34 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        label1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(102, 102, 255));
        label1.setText("Welcome to BookHub\n");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(440, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(410, 410, 410))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btndashboard.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btndashboard.setForeground(java.awt.Color.gray);
        btndashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-dashboard-24.png"))); // NOI18N
        btndashboard.setText("Dashboard");
        btndashboard.setBorder(null);
        btndashboard.setBorderPainted(false);
        btndashboard.setContentAreaFilled(false);
        btndashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndashboardMouseClicked(evt);
            }
        });
        btndashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndashboardActionPerformed(evt);
            }
        });

        btnadduser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnadduser.setForeground(java.awt.Color.gray);
        btnadduser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user-24.png"))); // NOI18N
        btnadduser.setText("Add User");
        btnadduser.setBorder(null);
        btnadduser.setBorderPainted(false);
        btnadduser.setContentAreaFilled(false);
        btnadduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadduserActionPerformed(evt);
            }
        });

        btnaddbook.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnaddbook.setForeground(java.awt.Color.gray);
        btnaddbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-add-book-24.png"))); // NOI18N
        btnaddbook.setText("Add Book");
        btnaddbook.setBorder(null);
        btnaddbook.setBorderPainted(false);
        btnaddbook.setContentAreaFilled(false);
        btnaddbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddbookActionPerformed(evt);
            }
        });

        btnviewuser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnviewuser.setForeground(java.awt.Color.gray);
        btnviewuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-users-24.png"))); // NOI18N
        btnviewuser.setText("View User");
        btnviewuser.setBorder(null);
        btnviewuser.setBorderPainted(false);
        btnviewuser.setContentAreaFilled(false);
        btnviewuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewuserActionPerformed(evt);
            }
        });

        btnviewbook.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnviewbook.setForeground(java.awt.Color.gray);
        btnviewbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-view-24.png"))); // NOI18N
        btnviewbook.setText("View Book");
        btnviewbook.setBorder(null);
        btnviewbook.setBorderPainted(false);
        btnviewbook.setContentAreaFilled(false);
        btnviewbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewbookActionPerformed(evt);
            }
        });

        jPanel4.setBackground(java.awt.Color.lightGray);
        jPanel4.setPreferredSize(new java.awt.Dimension(0, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        btnissuebook.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnissuebook.setForeground(java.awt.Color.gray);
        btnissuebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-book-24.png"))); // NOI18N
        btnissuebook.setText("Issue Book");
        btnissuebook.setBorder(null);
        btnissuebook.setBorderPainted(false);
        btnissuebook.setContentAreaFilled(false);
        btnissuebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnissuebookActionPerformed(evt);
            }
        });

        btnissuedbook.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnissuedbook.setForeground(java.awt.Color.gray);
        btnissuedbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-return-book-24.png"))); // NOI18N
        btnissuedbook.setText("Return Book");
        btnissuedbook.setBorder(null);
        btnissuedbook.setBorderPainted(false);
        btnissuedbook.setContentAreaFilled(false);
        btnissuedbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnissuedbookActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setForeground(java.awt.Color.gray);
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-logout-24.png"))); // NOI18N
        jButton9.setText("Logout");
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setForeground(java.awt.Color.gray);
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-exit-24.png"))); // NOI18N
        jButton10.setText("Exit");
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        btnissuedbook1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnissuedbook1.setForeground(java.awt.Color.gray);
        btnissuedbook1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-issued.png"))); // NOI18N
        btnissuedbook1.setText("Issued");
        btnissuedbook1.setBorder(null);
        btnissuedbook1.setBorderPainted(false);
        btnissuedbook1.setContentAreaFilled(false);
        btnissuedbook1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnissuedbook1MouseClicked(evt);
            }
        });
        btnissuedbook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnissuedbook1ActionPerformed(evt);
            }
        });

        btnreturned.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnreturned.setForeground(java.awt.Color.gray);
        btnreturned.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-return-24.png"))); // NOI18N
        btnreturned.setText("Returned");
        btnreturned.setBorder(null);
        btnreturned.setBorderPainted(false);
        btnreturned.setContentAreaFilled(false);
        btnreturned.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnreturnedMouseClicked(evt);
            }
        });
        btnreturned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnviewbook)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btndashboard)
                            .addComponent(btnaddbook)
                            .addComponent(btnadduser)
                            .addComponent(btnviewuser))
                        .addGap(22, 22, 22))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnissuebook)
                    .addComponent(btnissuedbook)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnreturned)
                            .addComponent(btnissuedbook1)
                            .addComponent(jButton10)
                            .addComponent(jButton9))))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btndashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnadduser)
                .addGap(14, 14, 14)
                .addComponent(btnaddbook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnviewuser)
                .addGap(24, 24, 24)
                .addComponent(btnviewbook)
                .addGap(26, 26, 26)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnissuebook, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnissuedbook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnissuedbook1)
                .addGap(18, 18, 18)
                .addComponent(btnreturned)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10)
                .addGap(23, 23, 23))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagementsystem/logo.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        refreshButton.setBackground(new java.awt.Color(153, 153, 255));
        refreshButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        refreshButton.setText("Refresh Statistics");
        refreshButton.setBorder(null);
        refreshButton.setBorderPainted(false);
        refreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshButtonMouseClicked(evt);
            }
        });
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Welcome to BookHub.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelaccount)
                        .addGap(150, 150, 150))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(labelaccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(java.awt.Color.lightGray);
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel1.setForeground(java.awt.Color.gray);
        jLabel1.setText("TOTAL  BOOK");

        totalbook.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        totalbook.setText("1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(totalbook, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalbook)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(java.awt.Color.lightGray);
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel2.setForeground(java.awt.Color.gray);
        jLabel2.setText("TOTAL  USER");

        totaluser.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        totaluser.setText("1");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(totaluser, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totaluser)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(java.awt.Color.lightGray);
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel3.setForeground(java.awt.Color.gray);
        jLabel3.setText("ISSUED  BOOK");

        totalissue.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        totalissue.setText("1");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(totalissue, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalissue)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(java.awt.Color.lightGray);
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel4.setForeground(java.awt.Color.gray);
        jLabel4.setText("RETURNED BOOK");

        totalreturn.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        totalreturn.setText("1");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(totalreturn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalreturn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.setBackground(java.awt.Color.white);
        jTabbedPane2.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.RIGHT);
        jTabbedPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane2.setFocusable(false);
        jTabbedPane2.setRequestFocusEnabled(false);
        jTabbedPane2.setVerifyInputWhenFocusTarget(false);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(1020, 410));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryManagementSystem/Welcome to Dashboard (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 1062, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("", new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-dashboard-24.png")), jPanel6); // NOI18N

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel13.setText("User Id");

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel14.setText("Phone Number");

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel15.setText("Name");

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel17.setText("Gmail");

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel18.setText("Address");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });

        txtfather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfatherActionPerformed(evt);
            }
        });

        txtgmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgmailActionPerformed(evt);
            }
        });

        btnsave.setBackground(new java.awt.Color(153, 153, 255));
        btnsave.setText("Save");
        btnsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsaveMouseClicked(evt);
            }
        });
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtuserid, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(txtphone)
                    .addComponent(txtfather)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(btnsave)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtgmail))
                .addGap(79, 79, 79))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtuserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtfather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtgmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnsave))
        );

        txtuserid.getAccessibleContext().setAccessibleName("");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagementsystem/girlss.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("", new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user-24.png")), jPanel10); // NOI18N

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setText("Book Id");

        jLabel25.setText("Writter");

        jLabel26.setText("Boook Name");

        jLabel27.setText("publisher year");

        jLabel28.setText("Publisher");

        txtname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtname2ActionPerformed(evt);
            }
        });

        txtwritter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwritterActionPerformed(evt);
            }
        });

        txtpublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpublisherActionPerformed(evt);
            }
        });

        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });

        btnsavebook.setText("Save");
        btnsavebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsavebookMouseClicked(evt);
            }
        });
        btnsavebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsavebookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbookid, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addComponent(txtpublisher, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtwritter, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(btnsavebook)
                    .addComponent(txtname2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtbookid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtwritter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtpublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnsavebook)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(338, 338, 338))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        jTabbedPane2.addTab("", new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-add-book-24.png")), jPanel11); // NOI18N

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        txttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "user id", "name", "phone number", "Address", "gmail"
            }
        ));
        jScrollPane1.setViewportView(txttable);

        btnupdate.setText("Update");
        btnupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnupdateMouseClicked(evt);
            }
        });
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setText("Phone Number");

        jLabel20.setText("Name");

        jLabel21.setText("Gmail");

        jLabel22.setText("Address");

        txtname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtname1ActionPerformed(evt);
            }
        });

        txtphone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphone1ActionPerformed(evt);
            }
        });

        txtfather1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfather1ActionPerformed(evt);
            }
        });

        txtgmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgmail1ActionPerformed(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(242, 95, 14));
        jLabel24.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(224, 82, 86));
        jLabel24.setText("Search and Update Table");

        jLabel6.setText("Enter Id:");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        btnsearch.setText("Search");
        btnsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsearchMouseClicked(evt);
            }
        });
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        btnclear.setText("Clear");
        btnclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnclearMouseClicked(evt);
            }
        });
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel19))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnsearch)
                                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))))
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtphone1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                        .addComponent(txtname1))))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtgmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfather1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnclear)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtphone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtfather1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtgmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsearch)
                    .addComponent(btnclear))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnupdate)
                        .addGap(128, 128, 128)
                        .addComponent(btndelete)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 83, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnupdate)
                    .addComponent(btndelete))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("", new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-users-24.png")), jPanel12); // NOI18N

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setOpaque(false);

        booktable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Book id", " Book name", "Writer", "Publisher", "Publish_Year"
            }
        ));
        jScrollPane2.setViewportView(booktable);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        jLabel59.setText("Writer");

        jLabel60.setText("Book name");

        jLabel61.setText("Publish_Year");

        jLabel62.setText("Publisher");

        txtname7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtname7ActionPerformed(evt);
            }
        });

        txtwriter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwriterActionPerformed(evt);
            }
        });

        txtpublisher2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpublisher2ActionPerformed(evt);
            }
        });

        txtpublishdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpublishdateActionPerformed(evt);
            }
        });

        jLabel65.setBackground(new java.awt.Color(242, 95, 14));
        jLabel65.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(224, 82, 86));
        jLabel65.setText("Search and Update Table");

        jLabel66.setText("Enter Id:");

        txtID5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID5ActionPerformed(evt);
            }
        });

        btnsearch5.setText("Search");
        btnsearch5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsearch5MouseClicked(evt);
            }
        });
        btnsearch5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch5ActionPerformed(evt);
            }
        });

        btnclear5.setText("Clear");
        btnclear5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnclear5MouseClicked(evt);
            }
        });
        btnclear5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclear5ActionPerformed(evt);
            }
        });

        btnupdate1.setText("Update");
        btnupdate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnupdate1MouseClicked(evt);
            }
        });
        btnupdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdate1ActionPerformed(evt);
            }
        });

        btndelete1.setText("Delete");
        btndelete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndelete1MouseClicked(evt);
            }
        });
        btndelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel64)
                                    .addComponent(jLabel65))))
                        .addContainerGap())
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnsearch5)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel60)
                                .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtwriter, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtID5, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                        .addComponent(txtname7))))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpublishdate, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpublisher2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnclear5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnupdate1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btndelete1))))))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(txtID5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(txtname7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtwriter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(txtpublisher2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(txtpublishdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsearch5)
                    .addComponent(btnclear5)
                    .addComponent(btnupdate1)
                    .addComponent(btndelete1))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("", new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-view-24.png")), jPanel13); // NOI18N

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("Book ID");

        jLabel10.setText("User ID");

        jLabel29.setText("Issue Date");

        jLabel30.setText("Due Date");

        txtbookid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbookid2ActionPerformed(evt);
            }
        });

        txtuserid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserid2ActionPerformed(evt);
            }
        });

        btnissue.setText("Issue");
        btnissue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnissueMouseClicked(evt);
            }
        });
        btnissue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnissueActionPerformed(evt);
            }
        });

        txtdue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtuserid2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(txtbookid2)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnissue))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtdue, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtissue)))))
                .addGap(729, 729, 729))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtbookid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtuserid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtissue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtdue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(btnissue)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("", new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-book-24.png")), jPanel14); // NOI18N

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("book id");

        jLabel31.setText("user id");

        jLabel32.setText("Issue date");

        jLabel33.setText("Due date");

        btnreturn.setText("Return");
        btnreturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnreturnMouseClicked(evt);
            }
        });
        btnreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnActionPerformed(evt);
            }
        });

        btnsearch2.setText("Search");
        btnsearch2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsearch2MouseClicked(evt);
            }
        });
        btnsearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch2ActionPerformed(evt);
            }
        });

        txtuserreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserreturnActionPerformed(evt);
            }
        });

        txtissuereturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtissuereturnActionPerformed(evt);
            }
        });

        txtduereturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtduereturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnreturn)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtuserreturn))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtbookreturn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66)
                        .addComponent(btnsearch2))
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addComponent(jLabel33)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtduereturn))
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addComponent(jLabel32)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtissuereturn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(474, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtbookreturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(btnsearch2)
                    .addComponent(txtuserreturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtissuereturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtduereturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnreturn)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("", new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-return-book-24.png")), jPanel15); // NOI18N

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        issuetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "user Id", "user name", "book id", "book name", "issue Date", "due Date"
            }
        ));
        jScrollPane3.setViewportView(issuetable);

        jLabel12.setText("Issue details");

        btnprint.setBackground(new java.awt.Color(153, 153, 255));
        btnprint.setForeground(new java.awt.Color(255, 255, 255));
        btnprint.setText("Print Issue Details");
        btnprint.setBorder(null);
        btnprint.setBorderPainted(false);
        btnprint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnprintMouseClicked(evt);
            }
        });
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(jLabel12))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel12)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("", new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-issued.png")), jPanel19); // NOI18N

        issuetable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "user Id", "user name", "book id", "book name", "issue Date", "due Date"
            }
        ));
        jScrollPane4.setViewportView(issuetable1);

        jLabel34.setText("Already Returned");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(449, 449, 449)
                .addComponent(jLabel34)
                .addContainerGap(508, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(80, Short.MAX_VALUE)))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel34)
                .addContainerGap(377, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(100, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("", new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-return-24.png")), jPanel20); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPane2)
                        .addGap(6, 6, 6))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndashboardActionPerformed
      jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_btndashboardActionPerformed

    private void btnadduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadduserActionPerformed
               jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_btnadduserActionPerformed

    private void btnaddbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddbookActionPerformed
       jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_btnaddbookActionPerformed

    
    private void btnviewuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewuserActionPerformed

        jTabbedPane2.setSelectedIndex(3);
        
          if (vu==null){
            vu=new AddviewuserController(this);
        }    
    }//GEN-LAST:event_btnviewuserActionPerformed
    public void addAddviewuserListner(ActionListener uog)
    {
        btnviewuser.addActionListener(uog);
    }
    
    private void btnviewbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewbookActionPerformed
        jTabbedPane2.setSelectedIndex(4);
        if (vb==null){
            vb=new AddviewbookController(this);
        }    
    }//GEN-LAST:event_btnviewbookActionPerformed

public void addAddviewbookListner(ActionListener zog)
{
    btnviewbook.addActionListener(zog);
}
    private void btnissuebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnissuebookActionPerformed
        jTabbedPane2.setSelectedIndex(5);
    }//GEN-LAST:event_btnissuebookActionPerformed

    private void btnissuedbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnissuedbookActionPerformed
        jTabbedPane2.setSelectedIndex(6);
    }//GEN-LAST:event_btnissuedbookActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.dispose();
        LoginView loginPage = new LoginView();
        loginPage.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       this.dispose();       
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btndashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndashboardMouseClicked

    }//GEN-LAST:event_btndashboardMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void txtfatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfatherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfatherActionPerformed

    private void txtgmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgmailActionPerformed

    private void btnsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsaveMouseClicked

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
       if (r==null){
            r=new AdduserController(this);
        }     
          
    }//GEN-LAST:event_btnsaveActionPerformed
public void addAdduserListner(ActionListener hog)
{
    btnsave.addActionListener(hog);
}
    
    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
                       if (dd==null){
            dd=new AdddeleteController(this);
        }     
    }//GEN-LAST:event_btndeleteActionPerformed
public void addAdddeleteListner(ActionListener ddog)
{
    btndelete.addActionListener(ddog);
}
    private void btnupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
                       if (uu==null){
            uu=new AddupdateController(this);
        }     
                                     
    }//GEN-LAST:event_btnupdateActionPerformed

public void addAddupdateListner(ActionListener uucog)
{
    btnupdate.addActionListener(uucog);
}
    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtname1ActionPerformed

    private void txtphone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphone1ActionPerformed

    private void txtfather1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfather1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfather1ActionPerformed

    private void txtgmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgmail1ActionPerformed

    private void btnsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsearchMouseClicked

    @SuppressWarnings("null")
    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
//               if (s==null){
//            s=new AddsearchController(this);
//        }         
//          s.searchActionPerformed(evt);    
        String username = txtID.getText(); // Get the username from the txtID field
        SentuserdataModel user = new SentuserdataModel();
        List<AddsearchModel> supplierList = null;
        try {
            supplierList = user.getSupplierData(username);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DashboardView.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (!supplierList.isEmpty()) {
            // Assuming there is only one matching record, retrieve the first element from the list
            AddsearchModel supplier = supplierList.get(0);

            // Set the retrieved data in the respective text fields
            txtname1.setText(supplier.getName2());
            txtphone1.setText(supplier.getPhone_num3());
            txtfather1.setText(supplier.getFather_name4());
            txtgmail1.setText(supplier.getGmail4());
        } else {
            // Show an error message if no matching record is found
            JOptionPane.showMessageDialog(null, "No user data found for the given username.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnclearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclearMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnclearMouseClicked

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        clearMe2();
    }//GEN-LAST:event_btnclearActionPerformed

    private void txtname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtname2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtname2ActionPerformed

    private void txtwritterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwritterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwritterActionPerformed

    private void txtpublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpublisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpublisherActionPerformed

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateActionPerformed

    private void btnsavebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsavebookMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsavebookMouseClicked

    private void btnsavebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavebookActionPerformed
       
            if (b==null){
            b=new AddbookController(this);
        } 
            
    }//GEN-LAST:event_btnsavebookActionPerformed
 public void addAddbookListner(ActionListener bog)
{
    btnsavebook.addActionListener(bog);
}
  
    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseClicked

    private void txtname7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtname7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtname7ActionPerformed

    private void txtwriterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwriterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwriterActionPerformed

    private void txtpublisher2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpublisher2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpublisher2ActionPerformed

    private void txtpublishdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpublishdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpublishdateActionPerformed

    private void txtID5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID5ActionPerformed

    private void btnsearch5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsearch5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsearch5MouseClicked

    private void btnsearch5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch5ActionPerformed
             conn = MyConnection.dbconnect();
       try {
    stmt = conn.createStatement();
    String name1 = txtname7.getText();
    String sql = "SELECT * FROM books WHERE name1 = '" + name1 + "'";
    ResultSet rs = stmt.executeQuery(sql);
    
    if (rs.next()) {
        // Retrieve the data from the result set
        String bookId = rs.getString("book_id");
        String writer = rs.getString("writer");
        String publisher = rs.getString("publisher");
        String publish_year = rs.getString("publish_year");
        
        // Set the retrieved data in the respective text fields
        txtID5.setText(bookId);
        txtwriter.setText(writer);
        txtpublisher2.setText(publisher);
        txtpublishdate.setText(publish_year);
    } else {
        // Clear the text fields if user is not found
        txtID5.setText("");
        txtwriter.setText("");
        txtpublisher2.setText("");
        txtpublishdate.setText("");
        
        JOptionPane.showMessageDialog(rootPane, "User not found");
    }
} catch (Exception e) {
    // Handle any exceptions that occur during the search
}
    }//GEN-LAST:event_btnsearch5ActionPerformed

    private void btnclear5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclear5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnclear5MouseClicked

    private void btnclear5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclear5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnclear5ActionPerformed

    private void btndelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelete1ActionPerformed
               if (ddb==null){
            ddb=new AdddeletebookController(this);
        }     
    }//GEN-LAST:event_btndelete1ActionPerformed
public void addAdddeletebookListner(ActionListener ddog)
{
    btndelete1.addActionListener(ddog);
} 
    private void btnupdate1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupdate1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdate1MouseClicked

    private void btnupdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdate1ActionPerformed
                       if (ub==null){
            ub=new AddupdatebookController(this);
        }     
    }//GEN-LAST:event_btnupdate1ActionPerformed

public void addAddupdatebookListner(ActionListener uubog)
{
    btnupdate1.addActionListener(uubog);
}
    private void btndelete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndelete1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btndelete1MouseClicked

    private void txtbookid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbookid2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbookid2ActionPerformed

    private void txtuserid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserid2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserid2ActionPerformed

    private void btnissueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnissueActionPerformed
    
            if (i==null){
            i=new AddissueController(this);
        } 
    }//GEN-LAST:event_btnissueActionPerformed
public void addAddissueListner(ActionListener iog)
{
    btnissue.addActionListener(iog);
}
    private void btnissueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnissueMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnissueMouseClicked

    private void txtuserreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserreturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserreturnActionPerformed

    private void txtissuereturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtissuereturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtissuereturnActionPerformed

    private void txtduereturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtduereturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtduereturnActionPerformed

    private void btnsearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch2ActionPerformed
                String bookId = txtbookreturn.getText();
                String userId = txtuserreturn.getText();

                try {
                    conn = MyConnection.dbconnect();
                    Statement statement = conn.createStatement();

                    String query = "SELECT * FROM issue WHERE book_id='" + bookId + "' AND user_id='" + userId + "'";
                    ResultSet resultSet = statement.executeQuery(query);

                    if (resultSet.next()) {
                         txtissuereturn.setText(resultSet.getString(3));
                        txtduereturn.setText(resultSet.getString(4));
                        txtuserreturn.setEditable(false);
                        txtbookreturn.setEditable(false);
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Book is not issued");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Connection error");
                }

               
                
    }//GEN-LAST:event_btnsearch2ActionPerformed

    private void btnsearch2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsearch2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsearch2MouseClicked

    private void btnreturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreturnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnreturnMouseClicked

    private void btnreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnActionPerformed
    if (re==null){
            re=new AddreturnController(this);
        }            
    }//GEN-LAST:event_btnreturnActionPerformed

public void addAddreturnListner(ActionListener iog)
{
    btnreturn.addActionListener(iog);
}




    private void btnissuedbook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnissuedbook1ActionPerformed
        jTabbedPane2.setSelectedIndex(7);
         if (ic==null){
            ic=new AddissuedController(this);
        }    

    }//GEN-LAST:event_btnissuedbook1ActionPerformed
public void addAddissuedListner(ActionListener ccog)
{
    btnissuedbook1.addActionListener(ccog);
}
    private void btnissuedbook1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnissuedbook1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnissuedbook1MouseClicked

    private void btnreturnedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreturnedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnreturnedMouseClicked

    private void btnreturnedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnedActionPerformed
        jTabbedPane2.setSelectedIndex(8);
        if (rc==null){
            rc=new AddreturnedController(this);
        }    
      
    }//GEN-LAST:event_btnreturnedActionPerformed

public void addAddreturnedListner(ActionListener ddog)
{
    btnreturned.addActionListener(ddog);
}
    private void refreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshButtonMouseClicked

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
         updateLiveCounts();        // TODO add your handling code here:
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void txtdueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdueActionPerformed

    private void btnprintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprintMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnprintMouseClicked

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        BillGenerator pv =new BillGenerator();
        pv.setVisible(true);
    }//GEN-LAST:event_btnprintActionPerformed
      
    
    
 
    //all textfield clear
        public void clearMe2()
    {
        txtname1.setText("");
        txtphone1.setText("");
        txtID.setText("");
        txtfather1.setText("");
        txtgmail1.setText("");
    }
    public void clearMe()
    {
        txtname.setText("");
        txtphone.setText("");
        txtuserid.setText("");
        txtfather.setText("");
        txtgmail.setText("");
    }
      public void clearMeBook()
    {
        txtbookid.setText("");
        txtname2.setText("");
        txtwritter.setText("");
        txtpublisher.setText("");
        txtdate.setText("");
    }
      public void clearMeBook2()
    {
        txtID5.setText("");
        txtname7.setText("");
        txtwriter.setText("");
        txtpublisher2.setText("");
        txtpublishdate.setText("");
    }
      
     public void clearIssue(){
         txtbookid2.setText("");
        txtuserid2.setText("");
        txtissue.setText("");
        txtdue.setText("");
     }
     
     public void clearReturn(){
         txtbookreturn.setText("");
        txtuserreturn.setText("");
        txtissuereturn.setText("");
        txtduereturn.setText("");
     }
     
     public void clearViewuser(){
        txtID.setText("");
       txtname1.setText("");
       txtphone1.setText("");
       txtfather1.setText("");
       txtgmail1.setText("");
     }
     public void clearViewbook(){
            txtID5.setText("");
            txtname7.setText("");
            txtwriter.setText("");
            txtpublisher2.setText("");
            txtpublishdate.setText("");
     }
     
     
     
     
     // refresh  after delete and update user data
       public void refreshTab(){
         conn = MyConnection.dbconnect();
            try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(sql);

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("user_id");
            model.addColumn("name");
            model.addColumn("phone_num");
            model.addColumn("father_name");
            model.addColumn("gmail");

            while (rs.next()) {
                String user_id = rs.getString("user_id");
                String name = rs.getString("name");
                String phone_num= rs.getString("phone_num");
                String father_name = rs.getString("father_name");
                String gmail = rs.getString("gmail");

                model.addRow(new Object[]{user_id, name, phone_num, father_name, gmail});
            }

            txttable.setModel(model);
        } catch (SQLException e) {
            // Handle any exceptions here
        }

    }
      // refresh  after delete and update book data

    public void refreshTab2(){
              conn = MyConnection.dbconnect();
            try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM books";
            ResultSet rs = stmt.executeQuery(sql);

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("book_id");
            model.addColumn("name1");
            model.addColumn("writer");
            model.addColumn("publisher");
            model.addColumn("publish_year");

            while (rs.next()) {
                String book_id = rs.getString("book_id");
                String name1 = rs.getString("name1");
                String writer= rs.getString("writer");
                String publisher = rs.getString("publisher");
                String publish_year = rs.getString("publish_year");

                model.addRow(new Object[]{book_id, name1, writer, publisher,publish_year});
            }

            booktable.setModel(model);
        } catch (SQLException e) {
            // Handle any exceptions here
        }


    }
    
// Create a method to fetch and update the live counts in the dashboard
    public void updateLiveCounts() {
        conn = MyConnection.dbconnect();
   try {
       Statement stmt = conn.createStatement();
    // Fetch count of users
    String countUsersQuery = "SELECT COUNT(*) FROM users";
    ResultSet usersResult = stmt.executeQuery(countUsersQuery);
    usersResult.next();
    int totalUsers = usersResult.getInt(1);

    // Fetch count of books
    String countBooksQuery = "SELECT COUNT(*) FROM books";
    ResultSet booksResult = stmt.executeQuery(countBooksQuery);
    booksResult.next();
    int totalBooks = booksResult.getInt(1);

    // Fetch count of issued books
    String countIssuesQuery = "SELECT COUNT(*) FROM issue WHERE returnBook = 'No'";
    ResultSet issuesResult = stmt.executeQuery(countIssuesQuery);
    issuesResult.next();
    int totalIssues = issuesResult.getInt(1);

    // Fetch count of returned books
    String countReturnedBooksQuery = "SELECT COUNT(*) FROM issue WHERE returnBook = 'Yes'";
    ResultSet returnedBooksResult = stmt.executeQuery(countReturnedBooksQuery);
    returnedBooksResult.next();
    int totalReturnedBooks = returnedBooksResult.getInt(1);

    // Update the labels in your dashboard
    totaluser.setText(Integer.toString(totalUsers));
    totalbook.setText(Integer.toString(totalBooks));
    totalissue.setText(Integer.toString(totalIssues));
    totalreturn.setText(Integer.toString(totalReturnedBooks));

    // Rest of your code...
    // refreshTab();

} catch (SQLException e) {
    System.out.println(e.getMessage());
    // Handle the exception
}
    }
// Example of how you might have your refresh button's action listener
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardView().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable booktable;
    private javax.swing.JButton btnaddbook;
    private javax.swing.JButton btnadduser;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnclear5;
    private javax.swing.JButton btndashboard;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btndelete1;
    private javax.swing.JButton btnissue;
    private javax.swing.JButton btnissuebook;
    private javax.swing.JButton btnissuedbook;
    private javax.swing.JButton btnissuedbook1;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnreturn;
    private javax.swing.JButton btnreturned;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsavebook;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnsearch2;
    private javax.swing.JButton btnsearch5;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnupdate1;
    private javax.swing.JButton btnviewbook;
    private javax.swing.JButton btnviewuser;
    private javax.swing.JTable issuetable;
    private javax.swing.JTable issuetable1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private java.awt.Label label1;
    private javax.swing.JLabel labelaccount;
    private javax.swing.JButton refreshButton;
    private javax.swing.JLabel totalbook;
    private javax.swing.JLabel totalissue;
    private javax.swing.JLabel totalreturn;
    private javax.swing.JLabel totaluser;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtID5;
    private javax.swing.JTextField txtbookid;
    private javax.swing.JTextField txtbookid2;
    private javax.swing.JTextField txtbookreturn;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtdue;
    private javax.swing.JTextField txtduereturn;
    private javax.swing.JTextField txtfather;
    private javax.swing.JTextField txtfather1;
    private javax.swing.JTextField txtgmail;
    private javax.swing.JTextField txtgmail1;
    private javax.swing.JTextField txtissue;
    private javax.swing.JTextField txtissuereturn;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtname1;
    private javax.swing.JTextField txtname2;
    private javax.swing.JTextField txtname7;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtphone1;
    private javax.swing.JTextField txtpublishdate;
    private javax.swing.JTextField txtpublisher;
    private javax.swing.JTextField txtpublisher2;
    private javax.swing.JTable txttable;
    private javax.swing.JTextField txtuserid;
    private javax.swing.JTextField txtuserid2;
    private javax.swing.JTextField txtuserreturn;
    private javax.swing.JTextField txtwriter;
    private javax.swing.JTextField txtwritter;
    // End of variables declaration//GEN-END:variables

    public void setMessage(String msg) {
    }


}
