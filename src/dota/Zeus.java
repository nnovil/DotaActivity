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
public class Zeus extends Hero {
    
    public Zeus(){
        name = "Zeus";
        type = "Intelligence";
        skills.add("Arc Lightning");
        skills.add("Lightning Bolt");
        skills.add("Static Field");
        skills.add("Thundergod's Wrath");
    }
    
    @Override
    public String attack(int atkIndex){
        return "Zeus attacks with "+skills.get(atkIndex);
    }
    
    @Override
    public String block(int atkIndex){
        return "Zeus blocks with "+skills.get(atkIndex);
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
