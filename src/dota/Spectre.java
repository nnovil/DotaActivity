/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dota;

/**
 *
 * @author asi
 */
public class Spectre extends Hero{

    public Spectre(){
        type = "Agility";
        skills.add("Spectral Dagger");
        skills.add("Desolate");
        skills.add("Dispersion");
        skills.add("Haunt");
    }
    
    @Override
    public String attack(int atkIndex) {
        return "Spectre attacks with "+skills.get(atkIndex);
    }

    @Override
    public String block(int atkIndex) {
        return "Spectre attacks with "+skills.get(atkIndex);
    }

    @Override
    public String getSkillAt(int index) {
        return skills.get(index);
    }
    
}
