/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import com.mycompany.walmartapp.Position;

/**
 *
 * @author zzxst
 */
public final class SalaryManager {

    private static final int MINIMUN_WAGE = 1750905;
    private static final int TRANSPORTATION_SUBSIDY = 249095;

    public static double calculatePermanentOrFixedTermContract(int weeklyHours, int hourValue) {
        double salary;
        salary = weeklyHours*hourValue;
        if(salary<MINIMUN_WAGE*2){
            salary = salary + TRANSPORTATION_SUBSIDY;
        }
        else{
            if (salary>=10*MINIMUN_WAGE){
                salary = salary*1.3;//Salario integral
            }  
        }
        return salary;
    }
    public static double calculateNetSalary(int weeklyHours, int hourValue, int bonus){
        double salary;
        salary = weeklyHours*hourValue;
        if (salary<=MINIMUN_WAGE*2){
            salary = (salary)*0.92+TRANSPORTATION_SUBSIDY+bonus;
        }
        else{
            if(salary>=MINIMUN_WAGE*10){
                salary = (salary)*0.92+salary*0.3+bonus;
            }        
        }
        return salary;
    }

    public static double calculateNetSalary(int weeklyHours, int hourValue){
        return calculateNetSalary(weeklyHours, hourValue, 0);
    }


}