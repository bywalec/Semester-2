/*
Napisz funkcję wykorzystującą operację bitowe, która sprawdzi czy dana liczba jest potęgą 2. Funkcja zwraca zmienną typu bool natomiast
jako argument wejściowy przyjmuje zmienną typu int.
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	int mask = 1 << 31;

	System.out.println("Podaj liczbe: ");
	Scanner scan = new  Scanner(System.in);

    int liczba = scan.nextInt();
    int licznik = 0;

    for(int i = 0 ; i < 32 ; i++)
    {
        if((mask & liczba) != 0)
        {
            licznik++;
        }
        mask >>>= 1;
    }

    if(licznik > 1)
    {
        System.out.println("Nie jest to potega dwojki.");
    }
    else
    {
        System.out.println("Jest to potega dwojki.");
    }

    }
}
