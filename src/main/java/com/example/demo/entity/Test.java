package com.example.demo.entity;

//import javax.persistence.*;
import java.io.Serializable;

//@Entity
//@Table(name = "TEST")
public class Test implements Serializable {

//    @Id
//    @Column(name = "ID")
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
//    @Column(name = "NAME")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
