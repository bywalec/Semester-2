/*
Napisz funkcję, która realizuje przesunięcie cykliczne. Cykliczne przesunięcie polega na wstawieniu bitów, które znikają
w wyniku zwykłego przesunięcia na początek sekwencji np. dla zwykłego przesunięcia
int a = 5 o 3 bity w prawo otrzymamy
0000 0000 0000 0000 0000 0000 0000 0000, natomiast dla przesunięcia cyklicznego otrzymamy
1010 0000 0000 0000 0000 0000 0000 0000.
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a = 5;
    int mask = 1 <<31;
    int przesuniecie = 3;

        System.out.println("Przed przesunieciem cyklicznym: ");
    for(int i = 0 ; i < 32 ; i++)
    {
        if((mask & a) != 0)
        {
            System.out.print(1);
        }
        else
        {
            System.out.print(0);
        }
        mask >>>= 1;
    }
    mask = 1 <<31;

        System.out.println();
        System.out.println("Po przesunieciu cyklicznym: ");

        for(int i = 32 - przesuniecie ; i < 32 ; i++)
        {
            if(((mask >>> i) & a) != 0)
            {
                System.out.print(1);
            }
            else
                System.out.print(0);
        }
        for(int i = 0 ; i < 32 - przesuniecie ; i++)
        {
            if(((mask >>> i) & a) != 0)
            {
                System.out.print(1);
            }
            else
                System.out.print(0);
        }

    }
}
