package org.gradiliste;

import org.gradiliste.paket1.GradjevinskeDozvole;
import org.gradiliste.paket3.GradjevinskiRadnik;
import org.gradiliste.paket4.Gradiliste;

import java.util.Arrays;
import java.util.Random;

public class GradjevinskaFirma implements GradjevinskeDozvole {
    private GradjevinskiRadnik gradjevinskiRadnik;
    private Gradiliste[] gradilista;
    private String adresa;

    public GradjevinskaFirma(GradjevinskiRadnik gradjevinskiRadnik, String adresa) {
        this.gradjevinskiRadnik = gradjevinskiRadnik;
        this.gradilista = new Gradiliste[20];
        this.adresa = adresa;
    }

    @Override
    public int podnosenjeZahteva(String lokalitet, String pib) {
        Random random = new Random();
        return random.nextInt(); // nasumican id zahteva
    }

    @Override
    public boolean prijemOdobrenjaDozvole(int idZahteva) {
        Random random = new Random();
        return random.nextBoolean(); // nasumicno (random) true ili false
    }

    public void vrednostInvesticija() {
        double ukupno = 0;
        for (Gradiliste g: gradilista) {
            ukupno = ukupno + g.getVrednostInvesticije();
        }
        System.out.println("Ukupna vrednost investicija je " + ukupno);
    }

    public GradjevinskiRadnik getGradjevinskiRadnik() {
        return gradjevinskiRadnik;
    }

    public void setGradjevinskiRadnik(GradjevinskiRadnik gradjevinskiRadnik) {
        this.gradjevinskiRadnik = gradjevinskiRadnik;
    }

    public Gradiliste[] getGradilista() {
        return gradilista;
    }

    public void setGradilista(Gradiliste[] gradilista) {
        this.gradilista = gradilista;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "GradjevinskaFirma{" +
                "gradjevinskiRadnik=" + gradjevinskiRadnik +
                ", gradilista=" + Arrays.toString(gradilista) +
                ", adresa='" + adresa + '\'' +
                '}';
    }

}
