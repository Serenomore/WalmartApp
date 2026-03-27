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
    private double grossSalary;
    private double netSalary;
    private ArrayList<Bonus> bonuses;
    private ArrayList<Deduction> deductiones;

    public Position(String namePosition, int typeOfContract, int monthlyHours, int basicSalary ,ArrayList<Bonus> bonuses, ArrayList<Deduction> deductiones) {
        this.namePosition = namePosition;
        this.typeOfContract = typeOfContract;
        this.monthlyHours = monthlyHours;
        this.bonuses = bonuses;
        this.deductiones = deductiones;
        this.basicSalary = basicSalary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }
    
    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
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
    public String getPositionInformation(){
        String information = "";
        information += "Nombre del cargo: "+namePosition+"\n";
        String contractName = (typeOfContract==0)? "Término fijo": "Término indefinido";
        information += "Tipo de contrato: "+contractName+"\n";
        information += "Salario base: "+basicSalary+"\n";
        information += "Horas mensuales: "+monthlyHours+"\n";
        information += "Salario bruto: "+grossSalary+"\n";
        information += "\t+Salario base: "+basicSalary+"\n";
        for (int i=0; i<bonuses.size(); i++){
            information += "\t+"+bonuses.get(i).getName()+": "+bonuses.get(i).getValue()+"\n";
        }
        information += "Salario neto: "+netSalary+"\n";
        information += "\t+Salario bruto: "+grossSalary+"\n";
         for (int i=0; i<deductiones.size(); i++){
            information += "\t-"+deductiones.get(i).getName()+": "+deductiones.get(i).getValue()+"\n";
        }
    return information;
    }
}
