/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.walmartapp;

/**
 *
 * @author zzxst
 */
public class Position {
    private String namePosition;
    private int typeOfContract;
    private int monthlyHours;
    private int hourValue;

    public Position(String namePosition, int typeOfContract, int monthlyHours, int hourValue) {
        this.namePosition = namePosition;
        this.typeOfContract = typeOfContract;
        this.monthlyHours = monthlyHours;
        this.hourValue = hourValue;
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

    public int getHourValue() {
        return hourValue;
    }

    public void setHourValue(int hourValue) {
        this.hourValue = hourValue;
    }
    
    
}
