/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.walmartapp;

import javax.swing.JOptionPane;

/**
 *
 * @author zzxst
 */
public class WalmartApp {

    public static void main(String[] args) {
        String option;
        Boolean op = true;
        Recruitment procesador = new Recruitment();
        while (op) {
            option = JOptionPane.showInputDialog("**************\nMENÚ PRINCIPAL\n**************\n\nIngrese el número de la opción deseada\n\n1. Registrar candidato\n2. Clasificar candidatos\n3. Entrevistar candidato");
            switch (option) {
                case "1":
                    System.out.println("Opción 1");
                    Candidate pj = new Candidate();
                    pj.registerCandidate();
                    procesador.addNewCandidate(pj);
                    break;
                case "2":
                    procesador.clasifyCandidates();
                    procesador.emptyNewCandidates();
                    JOptionPane.showMessageDialog(null,"Candidatos clasificados correctamente");
                    break;
                case "3":
                        if(procesador.getApprovedCandidates().isEmpty()){
                            JOptionPane.showMessageDialog(null,"No hay candidatos aptos para entrevistar");
                            break;    
                        }
                        else{
                            String auxiliar = "";
                            int aux;
                            for(int i=0; i<=procesador.getApprovedCandidates().size()-1; i++){
                                auxiliar += (i+1)+"."+procesador.getApprovedCandidates().get(i).name+"\n";
                            }
                            aux = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el número del candidato que desea entrevistar:\n"+auxiliar));
                            Interview entrevista = new Interview(procesador.getApprovedCandidates().get(aux-1));
                            entrevista.starInterview();
                            procesador.addInterview(entrevista);
                            JOptionPane.showMessageDialog(null,"La entrevista se guardó correctamente");
                        }
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta, intente de nuevo");
            }
        }
    }

}
