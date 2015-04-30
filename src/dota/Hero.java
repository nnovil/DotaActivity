/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dota;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asi
 */
abstract class Hero {
    String name;
    String type;
    List<String> skills = new ArrayList();
    
    public abstract String attack(int atkIndex);
    public abstract String block(int atkIndex);
    public abstract String getSkillAt(int index);
    public abstract String getName();
}
