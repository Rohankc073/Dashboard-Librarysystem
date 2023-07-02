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
public class AddviewuserModel {
    String user_id, name, phone_num, father_name, gmail;
    DefaultTableModel table;
    

    public AddviewuserModel(String user_id, String name, String phone_num, String father_name, String gmail, DefaultTableModel table) {
        this.user_id = user_id;
        this.name = name;
        this.phone_num = phone_num;
        this.father_name = father_name;
        this.gmail = gmail;
        this.table = table;
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

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public DefaultTableModel getTable() {
        return table;
    }

    public void setTable(DefaultTableModel table) {
        this.table = table;
    }
}