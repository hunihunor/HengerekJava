package main;

public class Henger {
    private static int hengerDarab = 0;
    private double r;
    private double m;
    
    Henger(double r, double m){
        this.r = r;
        this.m = m;
        hengerDarab++;
        HengerProgram.hengerek.add(this);
    }
//    Henger(double r, boolean isRadius){
//        this(r,10); 
//    }
//    Henger(boolean isHeight, double m){
//        this(5,m); 
//    }
    Henger(){
        this(5,10);
    }
    
    
    public int getHengerDarab(){
        return hengerDarab;
    }
    public double getSugar() {
        return r;
    }
    public double getMagassag() {
        return m;
    }
    
    public double terfogat(){
        double terfogat = (this.r*this.r*3.14)*this.m;
        return terfogat;
    }
    @Override
    public String toString() {
        return "Henger{" + "Sugár= " + r + "cm, Magasság= " + m + "cm, Térfogat= " + terfogat() + "cm3}";
    }
}
