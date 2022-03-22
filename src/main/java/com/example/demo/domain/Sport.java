package com.example.demo.domain;


// 1:M relation between location and sport

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Sport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;
    private String  tip;
    private String perioada;
    private String cost;
    private Long id;

    public Sport(String name, String tip, String perioada, String cost) {
        this.name = name;
        this.tip = tip;
        this.perioada = perioada;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getPerioada() {
        return perioada;
    }

    public void setPerioada(String perioada) {
        this.perioada = perioada;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
