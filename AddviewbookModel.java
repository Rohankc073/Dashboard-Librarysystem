/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bibhakta lamsal
 */
public class AddviewbookModel {
    String book_id, name1, writer, publisher, publish_year;
    DefaultTableModel booktable;
    
     public AddviewbookModel(String book_id, String name1, String writer, String publisher, String publish_year, DefaultTableModel booktable) {
        this.book_id = book_id;
        this.name1 = name1;
        this.writer = writer;
        this.publisher = publisher;
        this.publish_year = publish_year;
        this.booktable = booktable;
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

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublish_year() {
        return publish_year;
    }

    public void setPublish_year(String publish_year) {
        this.publish_year = publish_year;
    }

    public DefaultTableModel getBooktable() {
        return booktable;
    }

    public void setBooktable(DefaultTableModel booktable) {
        this.booktable = booktable;
    }
}
