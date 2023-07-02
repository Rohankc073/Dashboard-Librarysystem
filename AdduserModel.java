/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Bibhakta lamsal
 */
public class AdduserModel {
    String  user_id,name,phone_num,father_name,gmail;
    
     public AdduserModel(String user_id,String name,String phone_num,String father_name,String gmail)
    {
         this.user_id=user_id;
        this.name=name;
        this.phone_num=phone_num;
        this.father_name=father_name;
        this.gmail=gmail;
       
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
       public void clearMe(){
         
       setName("");
       setUser_id("");
       setPhone_num("");
       setGmail("");
       setFather_name("");
    }
}
