/*
Używając instrukcji warunkowych (if,else if,else) napisz program realizujący prosty kalkulator.
Kalkulator powinien mieć możliwość dodawania, odejmowania, mnożenia lub dzielenia dwóch liczb.
Wybór działania  może  być  dokonywany  poprzez  liczbę  np.  1-dodawania,  2-odejmowania.
*/
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int wybor;

            System.out.println("Podaj liczbe a: ");
            double a = scan.nextDouble();

            System.out.println("Podaj liczbe b: ");
            double b = scan.nextDouble();


            System.out.println("Wybierz dzialanie: ");
            System.out.println("(1) dodawanie");
            System.out.println("(2) odejmowanie");
            System.out.println("(3) mnozenie");
            System.out.println("(4) dzielenie");

            wybor = scan.nextInt();

                if(wybor == 1)
                {
                    System.out.println(a+b);
                }
                else if(wybor == 2)
                {
                    System.out.println(a-b);
                }
                else if(wybor == 3)
                {
                    System.out.println(a*b);
                }
                else if(wybor == 4)
                {
                    System.out.println(a/b);
                }



    }
}
