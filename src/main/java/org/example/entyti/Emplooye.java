package org.example.entyti;

import javax.persistence.*;

@Entity
@Table(name = "employers")
public class Emplooye {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String depertament;
    private int salary;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "deatails_id")
    private Detail employDetails;


    public Emplooye() {
    }

    public Emplooye(String name, String surname, String depertament, int salary) {
        this.name = name;
        this.surname = surname;
        this.depertament = depertament;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepertament() {
        return depertament;
    }

    public void setDepertament(String depertament) {
        this.depertament = depertament;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Detail getEmployDetails() {
        return employDetails;
    }

    public void setEmployDetails(Detail employDetails) {
        this.employDetails = employDetails;
    }
}
