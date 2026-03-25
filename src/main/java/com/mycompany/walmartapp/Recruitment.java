/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.walmartapp;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author zzxst
 */
public class Recruitment {
    private ArrayList<Candidate> newCandidates;
    private ArrayList<Candidate> approvedCandidates;
    private ArrayList<Candidate> rejectedCandidates;
    private ArrayList<Interview> interviewsMade;
    public Recruitment() {
        newCandidates = new ArrayList<>();
        approvedCandidates = new ArrayList<>();
        rejectedCandidates = new ArrayList<>();
        interviewsMade = new ArrayList<>();
    }
    public void addNewCandidate(Candidate candidato) {
        newCandidates.add(candidato);
    }
    public void clasifyCandidates() {
        if (!(newCandidates.isEmpty())){
            for (int i = 0; i <= newCandidates.size()-1; i++) {
                if (newCandidates.get(i).age >= 18 && newCandidates.get(i).getHasWorkExperience() == true && newCandidates.get(i).getIsGraduate() == true && newCandidates.get(i).getLivesInBogotaOrNear() == true) 
                    approvedCandidates.add(newCandidates.get(i));
                else {
                    rejectedCandidates.add(newCandidates.get(i));
                }
            } 
        }
    }
    public void emptyNewCandidates() {
        newCandidates.clear();
    }
    public void addInterview(Interview entrevista) {
        interviewsMade.add(entrevista);
    }
    public ArrayList<Candidate> getNewCandidates() {
        return newCandidates;
    }
    public void setNewCandidates(ArrayList<Candidate> newCandidates) {
        this.newCandidates = newCandidates;
    }
    public ArrayList<Candidate> getApprovedCandidates() {
        return approvedCandidates;
    }
    public void setApprovedCandidates(ArrayList<Candidate> approvedCandidates) {
        this.approvedCandidates = approvedCandidates;
    }
    public ArrayList<Candidate> getRejectedCandidates() {
        return rejectedCandidates;
    }
    public void setRejectedCandidates(ArrayList<Candidate> rejectedCandidates) {
        this.rejectedCandidates = rejectedCandidates;
    }
    public ArrayList<Interview> getInterviewsMade() {
        return interviewsMade;
    }
    public void setInterviewsMade(ArrayList<Interview> interviewsMade) {
        this.interviewsMade = interviewsMade;
    }
}
