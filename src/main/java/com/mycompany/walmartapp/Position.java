/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.walmartapp;

import java.util.ArrayList;

/**
 *
 * @author zzxst
 */
public class Position {
    private String namePosition;
    private int typeOfContract;
    private int monthlyHours;
    private int basicSalary;
    private double hourValue;
    private ArrayList<Bonus> bonuses;
    private ArrayList<Deduction> deductiones;

    public Position(String namePosition, int typeOfContract, int monthlyHours, double hourValue, ArrayList<Bonus> bonuses, ArrayList<Deduction> deductiones) {
        this.namePosition = namePosition;
        this.typeOfContract = typeOfContract;
        this.monthlyHours = monthlyHours;
        this.hourValue = hourValue;
        this.bonuses = bonuses;
        this.deductiones = deductiones;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public ArrayList<Bonus> getBonuses() {
        return bonuses;
    }

    public void setBonuses(ArrayList<Bonus> bonuses) {
        this.bonuses = bonuses;
    }

    public ArrayList<Deduction> getDeductiones() {
        return deductiones;
    }

    public void setDeductiones(ArrayList<Deduction> deductiones) {
        this.deductiones = deductiones;
    }

    public String getNamePosition() {
        return namePosition;
    }

    public void setNamePosition(String namePosition) {
        this.namePosition = namePosition;
    }

    public int getTypeOfContract() {
        return typeOfContract;
    }

    public void setTypeOfContract(int typeOfContract) {
        this.typeOfContract = typeOfContract;
    }

    public int getMonthlyHours() {
        return monthlyHours;
    }

    public void setMonthlyHours(int monthlyHours) {
        this.monthlyHours = monthlyHours;
    }

    public double getHourValue() {
        return hourValue;
    }

    public void setHourValue(double hourValue) {
        this.hourValue = hourValue;
    }
    
    
}
