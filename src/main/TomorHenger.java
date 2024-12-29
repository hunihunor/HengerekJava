package main;

public class TomorHenger extends Henger{
    private double fajsuly;
    
    TomorHenger(double r, double m, double fajsuly){
        super(r, m);
        this.fajsuly = fajsuly;
    }
    public TomorHenger(double r, double m) {
        super(r, m);
        this.fajsuly = 7.85;
    }

    public double getFajsuly() {
        return fajsuly;
    }
    
    public double suly(){
        return this.fajsuly*super.terfogat();
    }

    @Override
    public String toString() {
        return "TomorHenger{" + super.toString() + ", Tömeg=" + suly() + "g/cm3}";
    }
    
    
}
