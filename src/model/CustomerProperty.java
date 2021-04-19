package model;

import java.io.Serializable;
import java.util.UUID;


public class CustomerProperty implements Serializable {

    private int customer_id;
    private String name;
    private String address;
    private String phoneNumber;
    private String username;
    private String password;

    CustomerProperty(int customer_id, String name, String address, String phoneNumber, String username, String password) {
        this.customer_id = customer_id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
    }

    public int getCustomerId() {
        return customer_id;
    }

    public void setCustomerID(String customer_id) {

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
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
