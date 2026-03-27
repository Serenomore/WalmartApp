/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.walmartapp;

/**
 *
 * @author zzxst
 */
public class Bonus {
    private String name;
    private int value;

    public Bonus(String name, int value) {
        this.name = name;
        this.value = value;
    }
    public Bonus() {
        this.name = "";
        this.value = 0;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
}
