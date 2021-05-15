package model;

import java.io.Serializable;
import java.util.UUID;


public class CustomerProperty implements Serializable {

    private String customer_id ;
    private String name;
    private String address;
    private int phoneNumber;
    private String email;
    private String username;
    private String password;

    public CustomerProperty(String name, String address, String email, int phoneNumber, String username, String password) {
        this.customer_id =UUID.randomUUID().toString();
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email= email;
        this.username = username;
        this.password = password;
    }

    public String getCustomerId() {
        return customer_id;
    }




    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}
