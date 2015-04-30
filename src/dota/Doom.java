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
public class Doom extends Hero {

    public Doom(){
        name = "Doom";
        type = "Strength";
        skills.add("Devour");
        skills.add("Scorched Earth");
        skills.add("LVL? Death");
        skills.add("Doom");
    }
    
    @Override
    public String attack(int atkIndex) {
        return "Doom attacks with " + skills.get(atkIndex);
    }

    @Override
    public String block(int atkIndex) {
        return "Doom blocks with " + skills.get(atkIndex);
    }
    
    @Override
    public String getSkillAt(int index) {
        return skills.get(index);
    }
    
    @Override
    public String getName(){
        return name;
    }
    
}
