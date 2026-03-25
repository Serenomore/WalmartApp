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
public class Interview {
    private int score;
    private ArrayList<String> answers;
    private String suggestions;
    private Candidate candidate;

    public Interview(Candidate candidate) {
        score = 0;
        answers = new ArrayList<>();
        suggestions = "";
        this.candidate = candidate;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getSuggestions() {
        return suggestions;
    }
    public void setSuggestions(String suggestions) {
        this.suggestions = suggestions;
    }
    public Candidate getCandidate() {
        return candidate;
    }
    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }
    public ArrayList<String> getAnswers(){
        return answers;
    }
    public void setAnswers(ArrayList<String> answers){
        this.answers = answers;
    }
    public void starInterview(){
        answers.add(JOptionPane.showInputDialog("Describa brevemete la experiencia laboral que tiene"));
        answers.add(JOptionPane.showInputDialog("Indique el nivel de educación y/o títulos que posea"));
        answers.add(JOptionPane.showInputDialog("¿Cuál es la expectativa salarial?"));
        suggestions = JOptionPane.showInputDialog("Indique factores de riesgo o sugerencias si se detectó alguno, de lo contrario escriba: NO APLICA");
        score = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el puntaje final del candidato (de 0 a 100) "));
    }
}   
