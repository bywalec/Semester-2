/*
Napisz funkcję, która zwraca zmienną typu bool określającą czy liczba
typu int będąca argumentem wejściowym jest bitowym palindromem
np. 1100 0101 0111 1000 0001 1110 1010 0011 czyli 0xC5781EA3 jest
bitowym palindromem
 */

package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 0xC5781EA3;
        int mask1 = 1 << 31;
        int mask2 = 1;
        boolean check = false;

            for (int i = 0; i < 32; i++) {

            if ((((mask1) & number) != 0))
            {
                System.out.print(1);
            }
            else if ((((mask1) & number) == 0))
                System.out.print(0);

            mask1 >>>= 1;

            }
        System.out.println();

        mask1 = 1 << 31;

        for (int i = 0; i < 32; i++) {

            if ((((mask1) & number) != 0) == (((mask2) & number) != 0))
            {
                check = true;
            }
            else
            {
                check = false;
                break;
            }

            mask1 >>>= 1;
            mask2 = mask2 << 1;

            }
        System.out.println();
        if(check)
            System.out.println("Jest to palindrom.");
        else
            System.out.println("Nie jest to palindrom");
        }
}
