/*
 * @author Malthe
 * 07/10/2021 14.30
 *
 * Project_Foodwaste
 *
 */

package com.example.project_foodwaste.model;

public class Person {
    private String Name;
    private long phoneNumber;
    private String email;

    public Person(){
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
