package org.example.entyti;

import javax.persistence.*;
@Entity
@Table(name = "have")
public class Have {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String city;
    @Column(name = "humber_just")
    private String phoneNumber;


    public Have( String city, String phoneNumber ) {

        this.city = city;
        this.phoneNumber = phoneNumber;

    }

    public Have() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
