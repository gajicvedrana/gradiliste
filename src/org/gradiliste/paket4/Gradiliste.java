package org.gradiliste.paket4;

public class Gradiliste {

    public String adresa;
    public String tip;
    private double vrednostInvesticije;

    public Gradiliste(String adresa, String tip, double vrednostInvesticije) {
        this.adresa = adresa;
        this.tip = tip;
        this.vrednostInvesticije = vrednostInvesticije;
    }

    public double getVrednostInvesticije() {
        return vrednostInvesticije;
    }

    public void setVrednostInvesticije(double vrednostInvesticije) {
        this.vrednostInvesticije = vrednostInvesticije;
    }

    @Override
    public String toString() {
        return adresa + " (" + tip + ") - " + vrednostInvesticije + " RSD";
    }
}
