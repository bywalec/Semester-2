/*
Napisz program, który wyznacza największą wartość spośród elementów
tablicy typu int oraz zlicza ile razy ta liczba występuje w tablicy.
 */

package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Podaj rozmiar tablicy: ");
        int size = scan.nextInt();

        int[] tab = new int[size];

            for(int i = 0 ; i < size ; i++)
            {
                tab[i] = generator.nextInt(20);
            }

            for(int i = 0 ; i < size ; i++)
            {
                System.out.print("|" + tab[i] + "|");
            }

        System.out.println();

            int max = tab[0];

            for(int i = 0 ; i < size ; i++)
            {
                if(max < tab[i])
                {
                    max = tab[i];
                }
            }

        System.out.println("Max liczba to: " + max);

            int licznik = 0;

            for(int i = 0 ; i < size ; i ++)
            {
                if(tab[i] == max)
                {
                    licznik++;
                }
            }
        System.out.println("Wystapila " + licznik + " razy");



    }
}
