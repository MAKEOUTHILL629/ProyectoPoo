/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlenfermedades.bussines;

/**
 *
 * @author Felipe
 */
public class Diseases {
    private String name;
    private String symptom;
    private boolean treatment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public boolean isTreatment() {
        return treatment;
    }

    public void setTreatment(boolean treatment) {
        this.treatment = treatment;
    }
    
    
}
