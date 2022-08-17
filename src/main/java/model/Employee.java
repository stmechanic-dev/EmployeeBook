package model;

import util.Util;

import java.time.LocalDateTime;

public class Employee {

    private long id;

    private String name;

    private String country;

    //private LocalDateTime localDateTime;


    public Employee() {
    }

    public Employee(String name, String country) {
        long unique = Util.uniqueId();
        System.out.printf("Employee created with id - %s%n", unique);
        this.id = unique;
        this.name = name;
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
