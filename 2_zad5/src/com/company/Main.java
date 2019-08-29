/*
Napisz program, który obliczy średnią arytmetyczną oraz średnią ważoną liczb typu double umieszczonych w tablicy.
Wagi poszczególnych elementów są umieszczone w drugiej tablicy np.tab2.
 */
package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Podaj rozmiar tablicy: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        double[] tab1 = new double[size]; // waga ocen
        double[] tab2 = new double[size]; // oceny

        Random generator = new Random();

        double zmienna;

        // generator wag ocen

        for(int i = 0 ; i < tab1.length ; i++)
        {
            zmienna = (double)(generator.nextInt(5) + 1)/10 ;
            tab1[i] = zmienna;
        }

        System.out.println("Wagi ocen:");

        for(int i = 0 ; i < tab1.length ; i++)
        {
            System.out.print("|" + tab1[i] + "|");
        }
        System.out.println();

        //generator ocen


        for(int i = 0 ; i < tab2.length ; i++)
        {
            zmienna = (double)(generator.nextInt(5) + 1) ;
            tab2[i] = zmienna;
        }

        System.out.println("Oceny:");

        for(int i = 0 ; i < tab2.length ; i++)
        {
            System.out.print("|" + tab2[i] + "|");
        }
        System.out.println();

        double suma_ocen = 0;

        for(int i = 0 ; i < tab2.length ; i++)
        {
            suma_ocen += tab2[i];
        }

        double suma_wag = 0;

        for(int i = 0 ; i < tab1.length ; i++) //suma wag (mianownik)
        {
            suma_wag += tab1[i];
        }

        double suma_wazona = 0;

        for(int i = 0 ; i < tab1.length ; i++) // waga * ocena (licznik)
        {
            suma_wazona += tab1[i] * tab2[i];
        }

        System.out.println("średnia arytmetyczna ocen: " + suma_ocen / tab2.length);
        System.out.println("średnia ważona ocen: " + suma_wazona / suma_wag);


    }
}
