package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// Declarieren + initialisieren 2 Integer
        int ersteGanzzahl;
        int zweiteGanzzahl;
        boolean bedingung;
        ersteGanzzahl = 1;
        zweiteGanzzahl = 2;
        bedingung = ersteGanzzahl < zweiteGanzzahl;

        if (bedingung) {
            System.out.println("Die Bedingung ist Wahr");
        } else {
            System.out.println("Die Bedingung ist falsch");
        }

        //Übung: Preis: 200 und Steuersatz: 0,05 und max.Steuersatz: 0,04
        int preis;
        double steuersatz;
        double maxSteuersatz;
        preis = 200;
        steuersatz = 0.05;
        maxSteuersatz = 0.04;
        bedingung = steuersatz < maxSteuersatz;

        if (bedingung) {
            System.out.println("Der Steuersatz ist niedriger als der Maximaler Steuersatz");
        } else {
            System.out.println("Der Steuersatz darf nicht höher sein");
        }
        //BSP 2
        int ersteZahl;
        int zweiteZahl;
        int dritteZahl;
        int vierteZahl;
        ersteZahl = 1;
        zweiteZahl = 2;
        dritteZahl = 3;
        vierteZahl = 4;

        if (ersteZahl ==2 ) {
            System.out.println("Erste");
        }else if (zweiteZahl ==2) {
            System.out.println("Zweite");
        }else if (dritteZahl ==3) {
            System.out.println("Dritte");
        } else {
            System.out.println("Keine");
        }
        }
    }

