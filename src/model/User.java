package model;

import controller.manager.Manager;

public class User {
   private String nameUser;
   private String email;
   private String gender;
   private String idUser;


   //private List<User> listUser;

    public User(){

    }

    public User(String nameUser, String email, String gender, String idUser) {
        this.nameUser = nameUser;
        this.email = email;
        this.gender = gender;
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public void buyProduct(){
    }
}
