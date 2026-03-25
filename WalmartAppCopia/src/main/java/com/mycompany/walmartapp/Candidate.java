/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.walmartapp;

/**
 *
 * @author zzxst
 */
import javax.swing.JOptionPane;
public class Candidate extends Person {
    private Boolean hasWorkExperience;
    private Boolean isGraduate;
    private Boolean livesInBogotaOrNear;
    public Candidate(){
       hasWorkExperience = false;
       livesInBogotaOrNear = false;
       isGraduate = false;
    }
    public Boolean getHasWorkExperience(){
        return hasWorkExperience;
    }
    public void setHasWorkExperience(Boolean hasWorkExperience){
        this.hasWorkExperience = hasWorkExperience;
    }
     public Boolean getIsGraduate(){
        return isGraduate;
    }
    public void setIsGraduate(Boolean isGraduate){
        this.isGraduate = isGraduate;
    }
    public Boolean getLivesInBogotaOrNear(){
        return livesInBogotaOrNear;
    }
    public void setLivesInBogotaOrNear(Boolean livesInBogotaOrNear){
        this.livesInBogotaOrNear = livesInBogotaOrNear;
    }
    public void registerCandidate(){
        int auxiliar;
        name = JOptionPane.showInputDialog("Ingrese el nombre del candidato:");
        age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del candidato"));
        celphone = JOptionPane.showInputDialog("Ingrese el número de celular del candidato:");
        auxiliar = JOptionPane.showConfirmDialog(null,"¿Tiene experiencial laboral?","Seleccione una opción",JOptionPane.YES_NO_OPTION);
        if(auxiliar==JOptionPane.YES_OPTION)
            hasWorkExperience = true;
        else
            hasWorkExperience = false;
        auxiliar = JOptionPane.showConfirmDialog(null,"¿Es bachiller?","Seleccione una opción",JOptionPane.YES_NO_OPTION);
        if(auxiliar==JOptionPane.YES_OPTION)
            isGraduate = true;
        else
            isGraduate = false;
        auxiliar = JOptionPane.showConfirmDialog(null,"¿Vive en Bogotá o a menos de dos horas de distancia?","Seleccione una opción",JOptionPane.YES_NO_OPTION);
         if(auxiliar==JOptionPane.YES_OPTION)
            livesInBogotaOrNear = true;
        else
            livesInBogotaOrNear = false;
        JOptionPane.showMessageDialog(null, "Candidato registrado correctamente");
    }
}