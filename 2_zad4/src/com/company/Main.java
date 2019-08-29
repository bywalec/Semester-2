package com.company;
/*
Napisz program sprawdzający czy dwie tablice o identycznych rozmiarach i elementach typu
int zawieraj te same wartości (elementy niemuszą być w tej samej kolejności)
np. dla int tab1[] = {1, 2, 3, 4}orazint tab2[] = {4, 1, 2, 3}program wyświetli komunikat, że obie tablice
mają te same wartości.
 */
public class Main {

    public static void main(String[] args) {

	int tab1[] = {1, 2, 3, 4};
	int tab2[] = {4, 3, 2, 1};

	boolean check = false;

	    System.out.println("tab1: ");

            for(int i = 0 ; i < tab1.length ; i++)
            {
                System.out.print(tab1[i] + " ");
            }
            System.out.println();

        System.out.println("tab2: ");

            for(int i = 0 ; i < tab2.length ; i++)
            {
                System.out.print(tab2[i] + " ");
            }
            System.out.println();

         for(int i = 0 ; i < tab1.length ; i++)
         {
             for(int j = 0 ; j < tab2.length ; j++)
             {
                 if(tab1[i] == tab2[j])
                 {
                     check = true;
                     break;
                 }
                 else
                 {
                     check = false;
                 }
             }
         }

        System.out.println("Czy tablice maja takie same wartosci? ");
         if(check == true)
         {
             System.out.println("tak");
         }
         else
             System.out.println("nie");
    }
}
