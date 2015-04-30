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
public class Dota {

    /**
     * @param args the command line arguments
     */
    List<Hero> heroes = new ArrayList(); 
    int heroSelectedIndex;
    
    public Dota(){
        heroes.add(new Lina());
        heroes.add(new Zeus());
        heroes.add(new Mirana());
        heroes.add(new Spectre());
        heroes.add(new Doom());
    }
    
    public void setHero(int index){
        heroSelectedIndex = index;
    }
    
    public Hero getHero(){
        return heroes.get(heroSelectedIndex);
    }
    
    public String getHeroName(int index){
        return heroes.get(index).getName();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Dota d = new Dota();
        Hero h;
        boolean flag = true;
        boolean flag2 = true;
        do{
            System.out.println("Choose your hero:");
            for(int i=0; i<4; i++)
                System.out.println("\t"+d.getHeroName(i));
            
            do{
                System.out.println("Choose what to do");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Block");
            }while(flag2);
            
        }while(flag);
        
    }
    
}
