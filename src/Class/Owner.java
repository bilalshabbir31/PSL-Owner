/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.Date;




/**
 *
 * @author MUHAMMED BILAL
 */
public class Owner {
    private int id,cnic,phonenumber;
    private String Name,mail,nationality;
    private Date date;

    public Owner(){
        id=cnic=phonenumber=0;
        Name=mail=nationality="";
        date=null;
    }

    public Owner(int id,String Name, String mail,int phonenumber , int cnic,Date date,String nationality) {
        this.id = id;
        this.cnic = cnic;
        this.phonenumber = phonenumber;
        this.Name = Name;
        this.mail = mail;
        this.nationality = nationality;
        this.date=new Date(date.getYear(),date.getMonth(),date.getDay());
        this.date = date;
    }

    @Override
    public String toString() {
        return "Owner{" + "id=" + id + ", cnic=" + cnic + ", phonenumber=" + phonenumber + ", Name=" + Name + ", mail=" + mail + ", nationality=" + nationality + ", date=" + date + '}';
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCnic() {
        return cnic;
    }

    public void setCnic(int cnic) {
        this.cnic = cnic;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
