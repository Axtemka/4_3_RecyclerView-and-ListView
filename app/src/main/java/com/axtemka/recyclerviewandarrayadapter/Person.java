package com.axtemka.recyclerviewandarrayadapter;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable {
    private int id;
    private String name;
    private String phone;

    private List<Pet> pets;

    public Person(int id, String name, String phone, List<Pet> pets) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.pets = pets;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
