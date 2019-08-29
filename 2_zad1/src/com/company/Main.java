/*
Napisz program, umożliwiający wprowadzanie przez użytkownika liczb do tablicy o elementach typu double.
Wprowadzenie liczby muszą byćz zakresu [0,10], jeżeli użytkownik wprowadzi liczbę z poza przedziału,program ma wyświetlić
odpowiedni komunikat i poprosić o ponownewprowadzenie liczby dla danego indeksu.
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int size;

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj rozmiar tablicy: ");
        size = scan.nextInt();

        double[] tab = new double[size];
        double x;

        for(int i = 0 ;i < size ; i++)
        {
            System.out.println("Wprowadz liczbe z zakresu od 1 do 10 -> ");

            x = scan.nextDouble();

            if(x < 1 && x > 10)
            {
                System.out.println("Pamietaj o zakresie od 1 do 10");
                i--;
            }

            else
            {
                tab[i] = x;
            }

        }

        for(int j = 0 ; j < size ; j ++)
        {
            System.out.print("|" + tab[j] + "|");
        }
        System.out.println();
    }
}
