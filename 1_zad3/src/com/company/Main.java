/*
Używając  instrukcji switch napisz  program  wyświetlający  zarobkipracowników firmy
 np. wybierając 1, program przedstawi zarobki szefa, wybierając 2 zarobki programisty itd.
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("1. Szef.");
        System.out.println("2. Programista.");
        System.out.println("3. HR.");
        System.out.println("4. Grafik.");
        System.out.println("Wybierz kogo zarobki chcesz sprawdzić: ");
        Scanner scan = new Scanner(System.in);

                int wybor = scan.nextInt();

        switch(wybor){
            case 1:
                System.out.println("zarobki szefa: xxx");
                break;
            case 2:
                System.out.println(" zarobki programisty: xxx");
                break;
            case 3:
                System.out.println("zarobki pracownika HR: xxx");
                break;
            case 4:
                System.out.println("zarobki grafika: xxx");
                break;
            default:
                System.out.println("Wyszedles poza zakres.");
                break;
        }
    }
}
