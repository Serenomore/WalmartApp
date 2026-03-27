/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.walmartapp;
import Utilities.ReadGUI;
import Utilities.SalaryManager;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author zzxst
 */
public class Menu {

    public  void showMenu() {
        String option;
        Boolean op = true;
        Recruitment procesador = new Recruitment();
        PositionManager positionManager = new PositionManager();

        while (op) {
            option = JOptionPane.showInputDialog("*****************\nMENÚ PRINCIPAL\n*****************\n\nIngrese el número de la opción deseada\n\n1. Registrar candidato\n2. Mostrar listado de Candidatos APTOS\n3. Mostrar listad de candidatos NO APTOS \n4. Entrevistar candidato\n5. Agregar nuevo cargo");
            switch (option) {
                case "1":
                    Candidate pj = new Candidate();
                    pj.registerCandidate();
                    procesador.addNewCandidate(pj);
                    break;
                case "2":
                    procesador.clasifyCandidates();
                    procesador.emptyNewCandidates();
                    if (procesador.getApprovedCandidates().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "NO hay candidatos aptos");
                        break;
                    } else {
                        String auxiliar = "";
                        for (int i = 0; i <= procesador.getApprovedCandidates().size() - 1; i++) {
                            auxiliar += (i + 1) + "." + procesador.getApprovedCandidates().get(i).name + "\n";
                        }
                        JOptionPane.showMessageDialog(null, "Listado de candidatos APTOS\n" + auxiliar);
                        break;
                    }
                case "3":
                    procesador.clasifyCandidates();
                    procesador.emptyNewCandidates();
                    if (procesador.getRejectedCandidates().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "NO hay candidatps NO aptos");
                        break;
                    } else {
                        String auxiliar = "";
                        for (int i = 0; i <= procesador.getRejectedCandidates().size() - 1; i++) {
                            auxiliar += (i + 1) + "." + procesador.getRejectedCandidates().get(i).name + "\n";
                        }
                        JOptionPane.showMessageDialog(null, "Listado de candidatos NO APTOS\n" + auxiliar);
                        break;
                    }
                case "4":
                    if (procesador.getApprovedCandidates().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay candidatos aptos para entrevistar");
                        break;
                    } 
                    else {
                        String auxiliar = "";
                        int aux;
                        for (int i = 0; i <= procesador.getApprovedCandidates().size() - 1; i++) {
                            auxiliar += (i + 1) + "." + procesador.getApprovedCandidates().get(i).name + "\n";
                        }
                        aux = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el número del candidato que desea entrevistar:\n" + auxiliar));
                        Interview entrevista = new Interview(procesador.getApprovedCandidates().get(aux - 1));
                        entrevista.starInterview();
                        procesador.addInterview(entrevista);
                        JOptionPane.showMessageDialog(null, "La entrevista se guardó correctamente");
                        break;
                    }
                case "5":
                    positionManager.addNewPosition(addPosition());
                    JOptionPane.showMessageDialog(null, "El nuevo cargo se guardó correctamente");
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null,positionManager.getPositions().getFirst().getNamePosition());
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta, intente de nuevo");
            }
        }
    }
    public Position addPosition(){
        String name;
        int contract;
        int hours;
        double hourValue = 0;
        int basicSalary;
        ArrayList<Bonus> bonuses = null;
        ArrayList<Deduction> deductiones = null;
        int answer = 0;
        String[] contractTypes = {"Término fijo","Término indefinido"};
        name = ReadGUI.readString("Ingrese el nombre del nuevo cargo");
        contract = ReadGUI.readOptions("Tipo de contrato:", "Seleccion una opción", contractTypes);
        basicSalary = ReadGUI.readInt("Ingrese el salario base del cargo");
        hours = ReadGUI.readInt("Ingrese la cantidad de horas mensuales");
        hourValue = basicSalary/hours;
        while(answer == 0){
            answer = JOptionPane.showConfirmDialog(null,"¿Desea agregar un bono extralegal");
            if(answer==0){
               Bonus newBonus = null;
               newBonus.setName(ReadGUI.readString("Ingrese el nombre del nuevo bono"));
               newBonus.setValue(ReadGUI.readInt("Ingrese el valor del bono"));
               bonuses.add(newBonus);
               JOptionPane.showMessageDialog(null,"Bono registrado correctamente");
            }
            else{
                break;
            }
        }
        SalaryManager.calculateDeductions(deductiones, basicSalary);
        Position newPosition = new Position(name, contract, hours, hourValue, bonuses,SalaryManager.calculateDeductions(deductiones, basicSalary));
        return newPosition;
    }
}



