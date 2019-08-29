/*
Napisz program, który obliczy średnią arytmetyczną liczb w tablicy dwuwymiarowej powyżej przekątnej.
 */
package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj ilosc wierszy i kolumn: ");
        int w = scan.nextInt();

        //System.out.println("Podaj ilosc kolumn: ");
        //int k = scan.nextInt();

        int[][] tab = new int[w][w];

        Random generator = new Random();

        for(int i = 0 ; i < tab.length ; i++)
        {
            for(int j = 0 ; j < tab[i].length ; j++)
            {
                tab[i][j] = generator.nextInt(2);
            }
        }

        for(int i = 0 ; i < tab.length ; i++)
        {
            for(int j = 0 ; j < tab[i].length ; j++)
            {
                System.out.print("|" + tab[i][j] + "|");
            }
            System.out.println();
        }

        int suma = 0;
        int licznik = 0;

        for(int i = 0 ; i < tab.length ; i++)
        {
            for(int j = i + 1 ; j < tab[i].length ; j++)
            {
                suma += tab[i][j];
                licznik++;
            }

        }

        System.out.println("Srednia arytmetyczna powyzej przekatnej: " + (double)suma / licznik);




}
}
