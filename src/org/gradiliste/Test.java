package org.gradiliste;

import org.gradiliste.paket3.GradjevinskiRadnik;
import org.gradiliste.paket4.Gradiliste;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    public static void main(String[] args) {

        GradjevinskiRadnik radnik = new GradjevinskiRadnik(50000.00, 5);
        GradjevinskaFirma firma = new GradjevinskaFirma(radnik, "Zanatlijska 22");

        Gradiliste gradiliste1 = new Gradiliste("Knez Mihajlova 1","Visokogradnja", 100000.00);
        Gradiliste gradiliste2 = new Gradiliste("Knez Mihajlova 2","Visokogradnja", 200000.00);
        Gradiliste gradiliste3 = new Gradiliste("Knez Mihajlova 3","Visokogradnja", 300000.00);
        Gradiliste gradiliste4 = new Gradiliste("Knez Mihajlova 4","Visokogradnja", 500000.00);

        Gradiliste[] gradilista = new Gradiliste[4];
        gradilista[0] = gradiliste1;
        gradilista[1] = gradiliste2;
        gradilista[2] = gradiliste3;
        gradilista[3] = gradiliste4;
        firma.setGradilista(gradilista);

        firma.vrednostInvesticija();
        System.out.println(radnik.toString());
        System.out.println(gradiliste1.toString());
        radnik.setJmbg("1234567890123");


        try {
            System.out.println("--Aplikacija za unos gradilista--");
            System.out.println("--Unos prvog gradilista--");
            System.out.println("Molimo vas, ukucajte adresu prvog gradilista:");
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in));

            String adresa1 = reader.readLine();
            if (adresa1 == null || adresa1.isEmpty()) {
                System.out.println("Vrednost koju ste uneli nije ispravna. Pokusajte ponovo.");
                return;
            }

            System.out.println("Molimo vas, ukucajte tip prvog gradilista:");
            String tip1 = reader.readLine();
            if (tip1 == null || tip1.isEmpty()) {
                System.out.println("Vrednost koju ste uneli nije ispravna. Pokusajte ponovo.");
                return;
            }

            System.out.println("Molimo vas, ukucajte vrednost investicija prvog gradilista:");
            double vrednostInvesticija1;
            try {
                vrednostInvesticija1 = Double.parseDouble(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Vrednost koju ste uneli nije ispravna. Pokusajte ponovo.");
                return;
            }
            Gradiliste prvo = new Gradiliste(adresa1, tip1, vrednostInvesticija1);
            System.out.println("Uspesno ste kreirali gradiliste " + prvo.toString());

            System.out.println("--Unos drugog gradilista--");
            System.out.println("Molimo vas, ukucajte adresu drugog gradilista:");
            String adresa2 = reader.readLine();
            if (adresa2 == null || adresa2.isEmpty()) {
                System.out.println("Vrednost koju ste uneli nije ispravna. Pokusajte ponovo.");
                return;
            }
            System.out.println("Molimo vas, ukucajte tip drugog gradilista:");
            String tip2 = reader.readLine();
            if (tip2 == null || tip2.isEmpty()) {
                System.out.println("Vrednost koju ste uneli nije ispravna. Pokusajte ponovo.");
                return;
            }
            System.out.println("Molimo vas, ukucajte vrednost investicija drugog gradilista:");
            double vrednostInvesticija2;
            try {
                vrednostInvesticija2 = Double.parseDouble(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Vrednost koju ste uneli nije ispravna. Pokusajte ponovo.");
                return;
            }
            Gradiliste drugo = new Gradiliste(adresa2, tip2, vrednostInvesticija2);
            System.out.println("Uspesno ste kreirali drugo gradiliste " + drugo.toString());
            System.out.println("--Kraj--");

        } catch (IOException e) {
            System.out.println("Greska! Molimo vas pokusajte ponovo!");
        }

    }
}
