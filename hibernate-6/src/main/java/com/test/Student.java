package com.test;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id
    private int id;
    private String name;
    //@OneToMany --  Third Table will be created
    @ManyToMany(mappedBy = "student") //Laptop table will have Student ID reference
    private List<Laptop> laptop;

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

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }


}