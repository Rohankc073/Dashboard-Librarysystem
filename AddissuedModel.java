package model;

import javax.swing.table.DefaultTableModel;

/**
 * Model class for AddissuedModel
 * Represents the data for an issued book
 */
public class AddissuedModel {
    String user_id;
    String name;
    String book_id;
    String name1;
    String issue_date;
    String due_date;
    DefaultTableModel issueTable;

    public AddissuedModel(String user_id, String name, String book_id, String name1, String issue_date, String due_date, DefaultTableModel issueTable) {
        this.user_id = user_id;
        this.name = name;
        this.book_id = book_id;
        this.name1 = name1;
        this.issue_date = issue_date;
        this.due_date = due_date;
        this.issueTable = issueTable;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public DefaultTableModel getIssueTable() {
        return issueTable;
    }

    public void setIssueTable(DefaultTableModel issueTable) {
        this.issueTable = issueTable;
    }
}
