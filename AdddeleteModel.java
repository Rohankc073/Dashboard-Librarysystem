/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Bibhakta lamsal
 */
public class AdddeleteModel {
     String user_id1;
    String name2;
    String phone_num3;
    String father_name4;
    String gmail4;
    
    public AdddeleteModel(String user_id1, String name2, String phone_num3, String father_name4, String gmail4) {
        this.user_id1= user_id1;
        this.name2 = name2;
        this.phone_num3 = phone_num3;
        this.father_name4 = father_name4;
        this.gmail4 = gmail4;
    }

    public String getUser_id1() {
        return user_id1;
    }

    public void setUser_id1(String user_id1) {
        this.user_id1 = user_id1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getPhone_num3() {
        return phone_num3;
    }

    public void setPhone_num3(String phone_num3) {
        this.phone_num3 = phone_num3;
    }

    public String getFather_name4() {
        return father_name4;
    }

    public void setFather_name4(String father_name4) {
        this.father_name4 = father_name4;
    }

    public String getGmail4() {
        return gmail4;
    }

    public void setGmail4(String gmail4) {
        this.gmail4 = gmail4;
    } 
}

