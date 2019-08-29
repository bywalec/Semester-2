/*
Napisz program, który znajdzie drugi najmniejszy element w tablicy o elementach typu int.
 */
package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj rozmiar tablicy: ");
        int size = scan.nextInt();
        int[] tab  = new int[size];
        Random generator = new Random();

        for(int i = 0 ; i < size ; i++)
        {
            tab[i] = generator.nextInt(11);

            if(i < size -1)
            {
                System.out.print(tab[i] + " ");
            }
            else
            {
                System.out.println(tab[i]);
            }
        }

        int min1 = tab[0];
        int min2 = tab[0];

        for(int i = 0 ; i < size ; i++)
        {
            if(min1 > tab[i])
            {
                min1 = tab[i];
            }
        }

        for(int j = 0 ; j < size ; j++)
        {
            if(min2 > tab[j] && tab[j] != min1)
            {
                min2 = tab[j];
            }
        }

        System.out.println("Druga najmniejsza liczba to: " + min2);

    }
}
