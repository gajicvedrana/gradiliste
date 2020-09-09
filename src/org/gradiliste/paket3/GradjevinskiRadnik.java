package org.gradiliste.paket3;

import org.gradiliste.paket2.Radnik;

public class GradjevinskiRadnik extends Radnik {

    private double plata;
    private int lekarskiKriterijum;

    public GradjevinskiRadnik(double plata, int lekarskiKriterijum) {
        this.plata = plata;
        this.lekarskiKriterijum = lekarskiKriterijum;
    }

    @Override
    public boolean lekarskiPregled(int vrednost) {
        return vrednost > lekarskiKriterijum;
    }

    public void proracunBonusPlate(double procenat) {
        double uvecanaPlata = plata + (plata / 100 * procenat);
        System.out.println("Uvecana plata iznosi " + uvecanaPlata);
    }

    public void uvecanjePlate(double bonus) {
        double uvecanaPlata = plata + bonus;
        System.out.println("Uvecana plata iznosi " + uvecanaPlata);
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public int getLekarskiKriterijum() {
        return lekarskiKriterijum;
    }

    public void setLekarskiKriterijum(int lekarskiKriterijum) {
        this.lekarskiKriterijum = lekarskiKriterijum;
    }

    @Override
    public String toString() {
        return "GradjevinskiRadnik{" +
                "plata=" + plata +
                ", lekarskiKriterijum=" + lekarskiKriterijum +
                '}';
    }
}
