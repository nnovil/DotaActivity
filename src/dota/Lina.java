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
public class Lina extends Hero{

    public Lina(){
        type = "Intelligence";
        skills.add("Dragon Slave");
        skills.add("Light Strike Array");
        skills.add("Fiery Soul");
        skills.add("Laguna Blade");
    }
    
    @Override
    public String attack(int atkIndex) {
        return "Lina attacks with "+skills.get(atkIndex);
    }

    @Override
    public String block(int atkIndex) {
        return "Lina blocks with "+skills.get(atkIndex);
    }

    @Override
    public String getSkillAt(int index) {
        return skills.get(index);
    }
    
}
