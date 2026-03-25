/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.walmartapp;

/**
 *
 * @author zzxst
 */
import Utilities.SalaryManager;
import java.util.ArrayList;

public class PositionManager {

    public ArrayList<Position> getPositions() {
        return positions;
    }

    public void setPositions(ArrayList<Position> positions) {
        this.positions = positions;
    }

    private ArrayList<Position> positions;

    public PositionManager() {
        this.positions = new ArrayList<>();
    }

    public void addNewPosition(Position position) {
        positions.add(position);

    }
    public double calculateGrossSalary(Position position) {
        double salary = 0;
        switch (position.getTypeOfContract()) {
            case 0: //Término fijo 
                salary = SalaryManager.calculatePermanentOrFixedTermContract(position.getMonthlyHours(), position.getHourValue());
            case 1: //Término indefinido
                salary = SalaryManager.calculatePermanentOrFixedTermContract(position.getMonthlyHours(), position.getHourValue());
            
        }
        return salary;
    }
    }

