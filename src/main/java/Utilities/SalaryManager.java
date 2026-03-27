/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import com.mycompany.walmartapp.Bonus;
import com.mycompany.walmartapp.Deduction;
import java.util.ArrayList;

/**
 *
 * @author zzxst
 */
public final class SalaryManager {

    private static final int MINIMUN_WAGE = 1750905;
    private static final int TRANSPORTATION_SUBSIDY = 249095;

    public static double calculateNetSalary(double grossSalary, ArrayList<Bonus> bonuses, ArrayList<Deduction> deductiones) {
        double salary = 0;
        int totalDeductiones = 0;
        if (!(deductiones.isEmpty())) {
            for (int i = 0; i < deductiones.size(); i++) {
                totalDeductiones += deductiones.get(i).getValue();
            }
        }
        if (grossSalary <= MINIMUN_WAGE * 2) {
            salary = (grossSalary)-totalDeductiones;
        } else {
            if (grossSalary < MINIMUN_WAGE * 4) {
                salary = (grossSalary)-totalDeductiones;
            } else {
                if (grossSalary < MINIMUN_WAGE * 10) {
                    salary = (grossSalary)-totalDeductiones;
                } else {
                    salary = (grossSalary)-totalDeductiones;
                }
            }
        }
        return salary;
    }
    public static int getTransportationSubsidy(int basicSalary){
        int transportationSubsidy = 0;
        
        if(basicSalary<MINIMUN_WAGE*2){
            transportationSubsidy =  TRANSPORTATION_SUBSIDY;
        }
        return transportationSubsidy;
    }
    public static double calculateGrossSalary(int basicSalary, ArrayList<Bonus> bonuses ) {
    int totalBonuses = 0;    
    for (int i=0; i<bonuses.size(); i++){
            totalBonuses += bonuses.get(i).getValue();
        }
        return totalBonuses+basicSalary;
    }
    public static double calculateHealthDiscount(int grossSalary) {
        return grossSalary * 0.04;
    }
    public static double calculatePensionDiscount(int grossSalary) {
        return grossSalary * 0.04;
    }
    public static double calculateSolidarityContribution(int grossSalary) {
        if (grossSalary >= MINIMUN_WAGE * 4) {
            return grossSalary * 0.01;
        } else {
            return 0;
        }
    }
    public static ArrayList<Deduction> calculateDeductions(ArrayList<Deduction> deductiones, int grossSalary) {
        if (grossSalary < MINIMUN_WAGE * 4) {
            Deduction d1 = new Deduction();
            Deduction d2 = new Deduction();
            d1.setValue(calculatePensionDiscount(grossSalary));
            d1.setName("Pensión");
            d2.setValue(calculateHealthDiscount(grossSalary));
            d2.setName("Salud");
            deductiones.add(d1);
            deductiones.add(d2);
        } else {
            if (grossSalary >= MINIMUN_WAGE * 4 && grossSalary < MINIMUN_WAGE * 10) {
                Deduction d1 = new Deduction();
                Deduction d2 = new Deduction();
                Deduction d3 = new Deduction();
                d1.setValue(calculatePensionDiscount(grossSalary));
                d1.setName("Pensión");
                d2.setValue(calculateHealthDiscount(grossSalary));
                d2.setName("Salud");
                d3.setValue(calculateSolidarityContribution(grossSalary));
                d3.setName("Aporte solidario");
                deductiones.add(d1);
                deductiones.add(d2);
                deductiones.add(d3);
            }
        }
        return deductiones;
    }
}
