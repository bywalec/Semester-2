/*
Wykorzystując dowolne ale maksymalnie cztery pętlę napisz program rysujący ”choinkę”: Użytkownik wprowadza dwie zmienne do programu  np. x i y,  które  określają
ile  wierszy  ma  pierwsza  część  choinki oraz ile części ma cała choinka.
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj x: ");
        int x = scan.nextInt();
        System.out.println("Podaj y: ");
        int y = scan.nextInt();

        for(int z = 0 ; z < y ; z++)
        {
            for(int i = 0 ; i <  x + z ; i++)
            {
                for(int j = 0 ; j < (x + y) * 2  ; j++)
                {
                    if(j < (x + y - i) || j > (x + y + i) )
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                        System.out.print("X");
                    }

                }
                System.out.println();
            }
        }





    }
}
