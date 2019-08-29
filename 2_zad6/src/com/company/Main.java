/*
Napisz program, który zliczy ile razy jedna tablica występuje w drugiej
tablicy (elementy mogą się nakładać) np. dla int tab1[] = {1, 0, 1}
oraz int tab2[] = {1, 1, 1, 0, 1, 0, 1, 0 , 0, 1, 0, 1}, program zwróci 3.
 */
package com.company;

public class Main {

    public static void main(String[] args) {

        int tab1[] = {1, 1, 1, 0, 1, 0, 1, 0 , 0, 1, 0, 1};
        int tab2[] = {1, 0, 1};

        int licznik = 0;
        int ile_razy = 0;

	for(int i = 0 ; i < tab1.length - 2 ; i++)
    {
        for(int j = 0 ; j < tab2.length ; j++)
        {
            if(tab1[i + j] == tab2[j])
            {
                licznik++;
            }
        }
        if(licznik == tab2.length)
        {
            ile_razy++;
        }
        licznik = 0;
    }

        System.out.println("Sekwencja wystepuje " + ile_razy + " razy.");


     }
}
