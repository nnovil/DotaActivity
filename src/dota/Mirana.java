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
public class Mirana extends Hero{

    public Mirana(){
        name = "Mirana";
        type = "Agility";
        skills.add("Starstorm");
        skills.add("Sacred Arrow");
        skills.add("Leap");
        skills.add("Moonlight Shadow");
    }
    
    @Override
    public String attack(int atkIndex) {
       return "Mirana attacks with " +skills.get(atkIndex);
    }

    @Override
    public String block(int atkIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
