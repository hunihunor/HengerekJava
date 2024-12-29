package main;

public class Cso extends TomorHenger{
    private double falvastagsag;
    
    Cso(double r, double m, double fajsuly, double falvastagsag){
        super(r, m, fajsuly);
        this.falvastagsag = falvastagsag;
    }
    Cso(double r, double m, double falvastagsag){
        super(r, m);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }
    
    public double terfogat(){
        double rIn = super.getSugar() - falvastagsag;
        double kulsoTerfogat = super.terfogat();
        double belsoTerfogat = (rIn*rIn*3.14) * super.getMagassag();
        return kulsoTerfogat-belsoTerfogat;
    }
    public double suly(){
        return this.terfogat()*super.getFajsuly();
    }

    @Override
    public String toString() {
        return "Cso{" + super.toString() + ", falvastagsag=" + falvastagsag + "cm }";
    }    
}
