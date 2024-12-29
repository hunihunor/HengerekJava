
package main;

import java.util.ArrayList;
import java.util.List;


public class HengerProgram {
    public static ArrayList<Henger> hengerek;
    
    HengerProgram(){
        this.hengerek = new ArrayList<>();
    }
    
    public double atlagTerfogat(){
        double osszes = 0;
        for (Henger henger : hengerek) {
            osszes += henger.terfogat();
        }
        double atlag = osszes/hengerek.size();
        return atlag;
    }
    public double csovekSulya(){
        double csoSuly = 0;
        for (Henger henger : hengerek) {
            if(henger.getClass().equals(Cso.class)){
                csoSuly += ((Cso)henger).suly();
            }
        }
        return csoSuly;
    }
    public List<Henger> lista(){
        return hengerek;
    }
    
    public void run(){
        Henger standardHenger = new Henger();
        Henger széklábAlátét = new Henger(2, 0.5);
        System.out.println(standardHenger.getHengerDarab());
        System.out.println(standardHenger.toString());
        System.out.println(széklábAlátét.toString());
        
        TomorHenger esztergaMinta = new TomorHenger(5, 50, 3.84);
        TomorHenger acelHenger = new TomorHenger(10, 15);
        System.out.println(esztergaMinta.toString());
        System.out.println(acelHenger.suly()+"g");
        
        Cso csatornaCso = new Cso(11.5, 100, 1.2, 0.5);
        System.out.println(csatornaCso.suly());
        
        System.out.println(atlagTerfogat());
        System.out.println(csovekSulya());
        System.out.println(this.lista());
    }
    
    public static void main(String[] args) {
        HengerProgram program = new HengerProgram();
        program.run();
    }
    
}
